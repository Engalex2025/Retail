package client;

import generated.grpc.InventoryRefill.InventoryRestockGrpc;
import generated.grpc.InventoryRefill.RestockRequest;
import generated.grpc.InventoryRefill.RestockSummary;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * InventoryRestockClient is responsible for sending multiple restock requests
 * using client-streaming gRPC. It connects to the central server using the service name.
 */
public class InventoryRestockClient {

    public static void main(String[] args) throws InterruptedException {
        // Creating a gRPC channel using the hostname defined in the hosts file
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("inventory-service", 9090)
                .usePlaintext()
                .build();

        // Creating an asynchronous stub for the InventoryRestock service
        InventoryRestockGrpc.InventoryRestockStub asyncStub = InventoryRestockGrpc.newStub(channel);

        // Latch to wait for the server response
        CountDownLatch latch = new CountDownLatch(1);

        // Creating a client-stream to send multiple RestockRequest messages
        StreamObserver<RestockRequest> requestObserver = asyncStub.bulkRestock(
                new StreamObserver<RestockSummary>() {
                    @Override
                    public void onNext(RestockSummary summary) {
                        System.out.println("Total processed: " + summary.getTotalProcessed());
                        System.out.println("Total failed: " + summary.getTotalFailed());
                    }

                    @Override
                    public void onError(Throwable t) {
                        System.err.println("Error: " + t.getMessage());
                        latch.countDown();
                    }

                    @Override
                    public void onCompleted() {
                        System.out.println("Finished sending restock requests.");
                        latch.countDown();
                    }
                }
        );

        // Sending multiple restock requests
        requestObserver.onNext(RestockRequest.newBuilder()
                .setProductId("ITEM-101")
                .setQuantity(50)
                .build());

        requestObserver.onNext(RestockRequest.newBuilder()
                .setProductId("ITEM-102")
                .setQuantity(120)
                .build());

        requestObserver.onNext(RestockRequest.newBuilder()
                .setProductId("ITEM-103")
                .setQuantity(90)
                .build());

        // Marking the end of requests
        requestObserver.onCompleted();

        // Waiting for the server to respond
        latch.await(3, TimeUnit.SECONDS);

        channel.shutdown();
    }
}
