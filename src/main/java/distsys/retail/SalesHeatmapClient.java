package retail;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import generated.grpc.SalesHeatmap.SalesHeatmapGrpc;
import generated.grpc.SalesHeatmap.SalesHeatmapRequest;
import generated.grpc.SalesHeatmap.SalesHeatmapResponse;

public class SalesHeatmapClient {

    public static void main(String[] args) throws InterruptedException {
        // Define the target server address
        String target = "localhost:50051"; // Use the correct port
        
        // Create a managed channel to connect to the server
        ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
                .usePlaintext()  // Disable TLS for simplicity
                .build();

        // Create a stub for the SalesHeatmap service
        SalesHeatmapGrpc.SalesHeatmapStub asyncStub = SalesHeatmapGrpc.newStub(channel);

        // Prepare the request (SalesHeatmapRequest)
        SalesHeatmapRequest request = SalesHeatmapRequest.newBuilder()
                .setRegion("North America")
                .setPeriod("Q1 2025")
                .build();

        // Create a StreamObserver to handle the stream of responses
        StreamObserver<SalesHeatmapResponse> responseObserver = new StreamObserver<SalesHeatmapResponse>() {
            @Override
            public void onNext(SalesHeatmapResponse response) {
                // Handle each response as it arrives
                System.out.println("Product ID: " + response.getProductId());
                System.out.println("Sales Count: " + response.getSalesCount());
                System.out.println("Sales Value: " + response.getSalesValue());
            }

            @Override
            public void onError(Throwable t) {
                // Handle any errors
                System.err.println("Error: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                // Signal that the stream is complete
                System.out.println("Sales heatmap stream completed.");
            }
        };

        // Make the async call to get the sales heatmap (server streaming)
        asyncStub.getSalesHeatmap(request, responseObserver);

        // Keep the client alive to listen to the stream
        // Normally you'd use something like a CountDownLatch to block here, 
        // but for simplicity, we just wait for a while
        Thread.sleep(5000);

        // Clean up the resources
        channel.shutdownNow();
    }
}
