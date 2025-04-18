/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.retail;


import generated.grpc.InventoryRefill.InventoryRestockGrpc;
import generated.grpc.InventoryRefill.RestockRequest;
import generated.grpc.InventoryRefill.RestockSummary;
import generated.grpc.SalesHeatmap.AreaPerformance;
import generated.grpc.SalesHeatmap.RelocationRequest;
import generated.grpc.SalesHeatmap.RelocationResponse;

import generated.grpc.SmartPricing.SmartPricingGrpc;
import generated.grpc.SmartPricing.PriceUpdateRequest;
import generated.grpc.SmartPricing.PriceUpdateResponse;

import generated.grpc.SalesHeatmap.SalesHeatmapGrpc;
import generated.grpc.SecurityMonitor.Empty;
import generated.grpc.SecurityMonitor.SecurityAlert;
import generated.grpc.SecurityMonitor.SecurityIncident;
import generated.grpc.SecurityMonitor.SecurityResponse;
import generated.grpc.SecurityMonitor.StoreSecurityGrpc;



import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class RetailServer {
    private static final Logger logger = Logger.getLogger(RetailServer.class.getName());

    public static void main(String[] args) {
        InventoryRestockImpl inventoryRefill = new InventoryRestockImpl();
        SmartPricingImpl smartPricing = new SmartPricingImpl();
        SalesHeatmapImpl salesHeatmap = new SalesHeatmapImpl();
        StoreSecurityImpl storeSecurity = new StoreSecurityImpl(); 

        int port = 50051;

        try {
            Server server = ServerBuilder.forPort(port)
                    .addService(inventoryRefill)
                    .addService(smartPricing)      
                    .addService(salesHeatmap) 
                    .addService(storeSecurity)
                    .build();

            server.start();
            logger.info("Server started, listening on " + port);
            System.out.println("Server started, listening on " + port);
            server.awaitTermination();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
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
                int totalProcessed = 0;
                int totalFailed = 0;
                String productID;
                int qtty;

                @Override
                public void onNext(RestockRequest request) {
                        productID = request.getProductId();
                        qtty = request.getQuantity();

                        if (qtty <= 0 || qtty > 100) {
                            totalFailed++;
                            System.out.println("Failed to restock: Invalid quantity for Product ID " + productID);
                        } else {
                            totalProcessed++;
                            System.out.println("Restocked: Product ID " + productID + ", Quantity " + qtty);
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
                            .setTotalProcessed(totalProcessed)
                            .setTotalFailed(totalFailed)
                            .build();

                    responseObserver.onNext(summary); 
                    responseObserver.onCompleted();
                }
            };
        }
    }
       public static class SmartPricingImpl extends SmartPricingGrpc.SmartPricingImplBase {
         @Override
        public void updatePrice(PriceUpdateRequest request, StreamObserver<PriceUpdateResponse> responseObserver) {
            String productId = request.getProductId();
            double newPrice = request.getNewPrice();

            // Price Update 
            boolean success = true; 
            PriceUpdateResponse response = PriceUpdateResponse.newBuilder()
                    .setSuccess(success)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

            
           public static class SalesHeatmapImpl extends SalesHeatmapGrpc.SalesHeatmapImplBase {
        @Override
        public void suggestProductRelocation(RelocationRequest request, StreamObserver<RelocationResponse> responseObserver) {
   
             // Verifying RelocationRequest list
                List<String> suggestions = new ArrayList<>();

             // Acessing Performance List
                for (AreaPerformance performance : request.getPerformancesList()) {
            // Suggests based on Performance
                suggestions.add("Move products from Section " + performance.getAreaId() + " to high-traffic areas.");
            }

            // Building answers with suggestions 
                RelocationResponse response = RelocationResponse.newBuilder()
             .addAllSuggestions(suggestions)
             .build();

            // Sending the answer
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            }
        }
}
            
         class StoreSecurityImpl extends StoreSecurityGrpc.StoreSecurityImplBase {
             private static final Logger logger = Logger.getLogger(StoreSecurityImpl.class.getName());

            @Override
           
               public void streamSecurityAlerts(Empty request, StreamObserver<SecurityAlert> responseObserver) {
      
            // Alert Security
                SecurityAlert alert = SecurityAlert.newBuilder()
                    .setStoreId("A101")
                .setAlertMessage("Security breach detected!")
                .setTimestamp(getCurrentTimestamp())
                .build();

                responseObserver.onNext(alert);
                responseObserver.onCompleted();
        }

    @Override
    public StreamObserver<SecurityIncident> handleSecurityIncident(StreamObserver<SecurityResponse> responseObserver) {
        return new StreamObserver<SecurityIncident>() {
            @Override
            public void onNext(SecurityIncident incident) {
                // Processar incidente de segurança
                logger.info("Received incident: " + incident.getIncidentId());
                // Realizar alguma ação
                SecurityResponse response = SecurityResponse.newBuilder()
                        .setIncidentId(incident.getIncidentId())
                        .setResponseStatus("Action taken")
                        .build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {
                logger.severe("Error handling incident: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    // Timestamp Utilities 
    private String getCurrentTimestamp() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
