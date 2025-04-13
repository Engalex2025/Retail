/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.retail;

import generated.grpc.InventoryRefill.InventoryRestockGrpc;
import generated.grpc.InventoryRefill.RestockRequest;
import generated.grpc.InventoryRefill.RestockSummary;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.logging.Logger;

/**
 *
 * @author yourname
 */
public class RetailServer{
    private static final Logger logger = Logger.getLogger(RetailServer.class.getName());
    
    public static void main(String [] args){
       InventoryRestockImpl inventoryRefill = new InventoryRestockImpl();
       
        int port = 50051;
        
        try{
            Server server = ServerBuilder.forPort(port)
                    .addService(inventoryRefill)
                    .build()
                    .start();
            logger.info("Server started, listening on " + port);
            System.out.println("Server started, listening on " + port);
            server.awaitTermination();
            
        }catch(IOException e){
            //TODO Auto-generated catch block
            e.printStackTrace();
        }catch(InterruptedException e){
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    /*
    *
    *This service is a client streaming service
    */
    public static class InventoryRestockImpl extends InventoryRestockGrpc.InventoryRestockImplBase {
        @Override
        public StreamObserver<RestockRequest> bulkRestock(StreamObserver<RestockSummary> responseObserver) {
            return new StreamObserver<RestockRequest>() {
                int processedProducts = 0;
                int failedProducts = 0;
                String productID;
                int qtty;

                @Override
                public void onNext(RestockRequest request) {
                    try {
                        productID = request.getProductId();
                        qtty = request.getQuantity();

                        if (qtty <= 0 || qtty > 100) {
                            failedProducts++;
                            System.out.println("Failed to restock: Invalid quantity for Product ID " + productID);
                        } else {
                            processedProducts++;
                            System.out.println("Restocked: Product ID " + productID + ", Quantity " + qtty);
                        }
                    } catch (Exception e) {
                        failedProducts++;
                        System.out.println("Error processing restock request: " + e.getMessage());
                    }
                }

                @Override
                public void onError(Throwable t) {
                    logger.severe("Error: " + t.getMessage());
                }

                @Override
                public void onCompleted() {
                    //sending the summary when it is completed
                    RestockSummary summary = RestockSummary.newBuilder()
                            .setTotalProcessed(processedProducts)
                            .setTotalFailed(failedProducts)
                            .build();

                    responseObserver.onNext(summary); 
                    responseObserver.onCompleted();
                }
            };
        }
    }
}
