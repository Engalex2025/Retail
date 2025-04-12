package client;

import generated.grpc.SmartPricing.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;

/**
 * SmartPricing client for interacting with the SmartPricing service.
 * It communicates with the gRPC server to get and update product prices.
 */
public class SmartPricingClient {

    private final SmartPricingGrpc.SmartPricingBlockingStub blockingStub;

    // Constructor that initializes the blocking stub for SmartPricing service
    public SmartPricingClient(ManagedChannel channel) {
        blockingStub = SmartPricingGrpc.newBlockingStub(channel);
    }

    /**
     * Retrieves the price of a product.
     * 
     * @param productId ID of the product to query.
     * @return The price of the product.
     */
    public double getPrice(String productId) {
        ProductRequest request = ProductRequest.newBuilder()
                .setProductId(productId)
                .build();
        
        ProductResponse response;
        try {
            response = blockingStub.getPrice(request);
            System.out.println("Product Price: " + response.getPrice());
            return response.getPrice();
        } catch (Exception e) {
            System.err.println("Error fetching price: " + e.getMessage());
            return -1;
        }
    }

    /**
     * Updates the price of a product.
     * 
     * @param productId ID of the product to update.
     * @param newPrice The new price for the product.
     * @return true if the update was successful, false otherwise.
     */
    public boolean updatePrice(String productId, double newPrice) {
        PriceUpdateRequest request = PriceUpdateRequest.newBuilder()
                .setProductId(productId)
                .setNewPrice(newPrice)
                .build();

        PriceUpdateResponse response;
        try {
            response = blockingStub.updatePrice(request);
            if (response.getSuccess()) {
                System.out.println("Price updated successfully.");
                return true;
            } else {
                System.out.println("Price update failed.");
                return false;
            }
        } catch (Exception e) {
            System.err.println("Error updating price: " + e.getMessage());
            return false;
        }
    }

    /**
     * Main method to run the client and test SmartPricing service.
     */
    public static void main(String[] args) throws InterruptedException {
        String target = "localhost:9090"; // Replace with appropriate server address
        ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
                .usePlaintext()
                .build();

        try {
            SmartPricingClient client = new SmartPricingClient(channel);
            
            // Test GetPrice
            String productId = "12345";
            client.getPrice(productId);
            
            // Test UpdatePrice
            double newPrice = 49.99;
            client.updatePrice(productId, newPrice);
        } finally {
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
    }
}
