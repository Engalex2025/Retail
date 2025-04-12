package server;

import generated.grpc.InventoryRefill.InventoryRestockServiceImpl;
import generated.grpc.SalesHeatmap.SalesHeatmapServiceImpl;
import generated.grpc.SecurityMonitor.SecurityMonitorServiceImpl;
import generated.grpc.SmartPricing.SmartPricingServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * Main gRPC server for the Retail Automation System.
 * It registers all service implementations in one place.
 */
public class RetailServer {

    private Server server;

    private void start() throws IOException {
        int port = 9090;

        server = ServerBuilder.forPort(port)
                .addService(new InventoryRestockServiceImpl())
                .addService(new SalesHeatmapServiceImpl())
                .addService(new SecurityMonitorServiceImpl())
                .addService(new SmartPricingServiceImpl())
                .build()
                .start();

        System.out.println("Retail gRPC server started on port: " + port);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("Shutting down Retail gRPC server...");
            RetailServer.this.stop();
            System.err.println("Server shut down.");
        }));
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final RetailServer server = new RetailServer();
        server.start();
        server.blockUntilShutdown();
    }
}
