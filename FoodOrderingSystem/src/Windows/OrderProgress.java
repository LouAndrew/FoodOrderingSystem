package Windows;
public class OrderProgress extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(OrderProgress.class.getName());

    public OrderProgress() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserNameLabel = new javax.swing.JLabel();
        GrandTotalLabel = new javax.swing.JLabel();
        DeliveryAddressLabel = new javax.swing.JLabel();
        OrderStatusLabel = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        OrderProgressLabel = new javax.swing.JLabel();
        UserNameFeild = new javax.swing.JLabel();
        DeliveryAddressFeild = new javax.swing.JLabel();
        OrderStatusFeild = new javax.swing.JLabel();
        GrandTotalFeild = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Food Ordering System");
        setResizable(false);

        UserNameLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        UserNameLabel.setText("User name:");

        GrandTotalLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        GrandTotalLabel.setText("Grand Total:");

        DeliveryAddressLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        DeliveryAddressLabel.setText("Delivery address:");

        OrderStatusLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        OrderStatusLabel.setText("Order status:");

        ExitButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        OrderProgressLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        OrderProgressLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OrderProgressLabel.setText("Order progress");

        UserNameFeild.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        DeliveryAddressFeild.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        OrderStatusFeild.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        GrandTotalFeild.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UserNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UserNameFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(OrderStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(OrderStatusFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(GrandTotalLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(GrandTotalFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DeliveryAddressLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DeliveryAddressFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(OrderProgressLabel)))
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OrderProgressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserNameFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GrandTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GrandTotalFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DeliveryAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeliveryAddressFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(OrderStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(OrderStatusFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
       this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        UserNameFeild.setText("hj");
        DeliveryAddressFeild.setText("fhcdjx");
        GrandTotalFeild.setText("vds");
        OrderStatusFeild.setText("feds");
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> new OrderProgress().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel DeliveryAddressFeild;
    private javax.swing.JLabel DeliveryAddressLabel;
    private javax.swing.JButton ExitButton;
    private static javax.swing.JLabel GrandTotalFeild;
    private javax.swing.JLabel GrandTotalLabel;
    private javax.swing.JLabel OrderProgressLabel;
    private static javax.swing.JLabel OrderStatusFeild;
    private javax.swing.JLabel OrderStatusLabel;
    private static javax.swing.JLabel UserNameFeild;
    private javax.swing.JLabel UserNameLabel;
    // End of variables declaration//GEN-END:variables
}
