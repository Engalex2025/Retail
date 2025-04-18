/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package distsys.retail;


import generated.grpc.SalesHeatmap.SalesHeatmapGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 *
 * @Alexandre
 */
public class SalesHeatmapGUI extends javax.swing.JFrame {

    private static final Logger logger = Logger.getLogger(SalesHeatmapGUI.class.getName());
    private static SalesHeatmapGrpc.SalesHeatmapStub asyncStub;
    private static SalesHeatmapGrpc.SalesHeatmapBlockingStub blockingStub;
    ManagedChannel channel;
    
     private final String[] sections = {"A101", "B202", "C303", "D404", "E505", "F606", "G707", "H808"};
    private final int[] salesData = new int[sections.length];
    private boolean salesTracked = false;

    /**
     * Creates new form SalesHeatmapGUI
     */
    public SalesHeatmapGUI() {
    initComponents();
    outputUpdates.setEnabled(true);
    outputUpdates.setEditable(false);

    outputUpdates.append("Interface initialized!\n");

    channel = ManagedChannelBuilder
            .forAddress("localhost", 50051)
            .usePlaintext()
            .build();
    
    // Definining 2 seconds timing
    asyncStub = SalesHeatmapGrpc.newStub(channel).withDeadlineAfter(2, TimeUnit.SECONDS);
    blockingStub = SalesHeatmapGrpc.newBlockingStub(channel).withDeadlineAfter(2, TimeUnit.SECONDS);
}

     private int getSalesPerformance(String sectionId) {
        Random rand = new Random();
        return rand.nextInt(50); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        trackSales = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputUpdates = new javax.swing.JTextArea();
        realocationSuggestions = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        suggestionOutput = new javax.swing.JTextArea();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        trackSales.setText("Track Sales");
        trackSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackSalesActionPerformed(evt);
            }
        });

        outputUpdates.setColumns(20);
        outputUpdates.setLineWrap(true);
        outputUpdates.setRows(5);
        outputUpdates.setWrapStyleWord(true);
        jScrollPane2.setViewportView(outputUpdates);

        realocationSuggestions.setText("Suggestions");
        realocationSuggestions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realocationSuggestionsActionPerformed(evt);
            }
        });

        suggestionOutput.setColumns(20);
        suggestionOutput.setLineWrap(true);
        suggestionOutput.setRows(5);
        suggestionOutput.setWrapStyleWord(true);
        jScrollPane4.setViewportView(suggestionOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
            .addComponent(jScrollPane4)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(trackSales))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(realocationSuggestions)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(trackSales)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(realocationSuggestions)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void trackSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trackSalesActionPerformed
                                          
    outputUpdates.setText(""); // Clear output

    for (int i = 0; i < sections.length; i++) {
        try {
            salesData[i] = getSalesPerformance(sections[i]); // Simula as vendas
            outputUpdates.append("Section: " + sections[i] + " | Sales: " + salesData[i] + "\n");
        } catch (StatusRuntimeException e) {
            outputUpdates.append("Error: Timeout or other issue while fetching data for section: " + sections[i] + "\n");
        }
    }

    salesTracked = true; // Flag to indicate that data is ready

    // Finding the best and worst section
    String bestSection = null, worstSection = null;
    int highest = Integer.MIN_VALUE, lowest = Integer.MAX_VALUE;

    for (int i = 0; i < salesData.length; i++) {
        if (salesData[i] > highest) {
            highest = salesData[i];
            bestSection = sections[i];
        }
        if (salesData[i] < lowest) {
            lowest = salesData[i];
            worstSection = sections[i];
        }
    }

    outputUpdates.append("Sales tracking completed.\n");
    outputUpdates.append("Best Section: " + bestSection + " | Sales: " + highest + "\n");
    outputUpdates.append("Worst Section: " + worstSection + " | Sales: " + lowest + "\n");

    }//GEN-LAST:event_trackSalesActionPerformed

    private void realocationSuggestionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realocationSuggestionsActionPerformed
                                                                                                                                                                                                                                                                                                                                                                                          
    suggestionOutput.setText(""); // Clear output

    if (!salesTracked) {
        suggestionOutput.setText("Please click 'Track Sales' first.\n");
        return;
    }

    try {
        int maxSales = Integer.MIN_VALUE, minSales = Integer.MAX_VALUE;
        String bestSection = "", worstSection = "";

        for (int i = 0; i < sections.length; i++) {
            int sales = salesData[i];
            if (sales > maxSales) {
                maxSales = sales;
                bestSection = sections[i];
            }
            if (sales < minSales) {
                minSales = sales;
                worstSection = sections[i];
            }
        }

        suggestionOutput.append("Move products from Section " + worstSection + 
                        " (Sales: " + minSales + ") to Section " + 
                        bestSection + " (Sales: " + maxSales + ").\n");

        suggestionOutput.append("Relocation suggestions completed.\n");
    } catch (StatusRuntimeException e) {
        suggestionOutput.append("Error: Timeout or other issue while generating relocation suggestions.\n");
    }



    }//GEN-LAST:event_realocationSuggestionsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SalesHeatmapGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesHeatmapGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesHeatmapGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesHeatmapGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesHeatmapGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea outputUpdates;
    private javax.swing.JButton realocationSuggestions;
    private javax.swing.JTextArea suggestionOutput;
    private javax.swing.JButton trackSales;
    // End of variables declaration//GEN-END:variables
}
