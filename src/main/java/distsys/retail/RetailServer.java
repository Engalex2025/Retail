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
import generated.grpc.SalesHeatmap.SalesRequest;
import generated.grpc.SalesHeatmap.SalesUpdate;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

/**
 *
 * @author Alexandre
 */
public class RetailServer{
    private static final Logger logger = Logger.getLogger(RetailServer.class.getName());
    
    public static void main(String [] args){
       InventoryRestockImpl inventoryRefill = new InventoryRestockImpl();
       
       SmartPricingImpl smartPricing = new SmartPricingImpl();
       
       SalesHeatmapImpl salesHeatmap = new SalesHeatmapImpl();

       
        int port = 50051;
        
        try{
            Server server = ServerBuilder.forPort(port)
                    .addService(inventoryRefill)
                    .addService(smartPricing)      
                    .addService(salesHeatmap) 
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

            // Lógica de atualização de preço (simulação)
            boolean success = true; // Sucesso por padrão (pode adicionar lógica real aqui)
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
    // Verificando a lista de performances do RelocationRequest
    List<String> suggestions = new ArrayList<>();

    // Acessando a lista de performances
    for (AreaPerformance performance : request.getPerformancesList()) {
        // Lógica para gerar sugestões com base nas performances
        suggestions.add("Move products from Section " + performance.getAreaId() + " to high-traffic areas.");
    }

    // Construindo a resposta com as sugestões
    RelocationResponse response = RelocationResponse.newBuilder()
            .addAllSuggestions(suggestions)
            .build();

    // Enviando a resposta
    responseObserver.onNext(response);
    responseObserver.onCompleted();
}
           }
}