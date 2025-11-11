package Windows;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class CheckOutWindow extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CheckOutWindow.class.getName());

    /**
     * Creates new form CheckOutWindow
     */
    public CheckOutWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkOutLabel = new javax.swing.JLabel();
        MakeOrderButton = new javax.swing.JButton();
        yourOrderLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderFeild = new javax.swing.JTextArea();
        grandtotalLabel = new javax.swing.JLabel();
        totalFeild = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Food Ordering System");
        setResizable(false);

        checkOutLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        checkOutLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkOutLabel.setText("CheckOut");

        MakeOrderButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        MakeOrderButton.setText("Make Order");
        MakeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MakeOrderButtonActionPerformed(evt);
            }
        });

        yourOrderLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        yourOrderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yourOrderLabel.setText("Your Order:");

        orderFeild.setColumns(20);
        orderFeild.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        orderFeild.setRows(5);
        jScrollPane1.setViewportView(orderFeild);

        grandtotalLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        grandtotalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grandtotalLabel.setText("Grand Total:");

        totalFeild.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(grandtotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yourOrderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(totalFeild)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MakeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkOutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(192, 192, 192))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(checkOutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(yourOrderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grandtotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110)
                .addComponent(MakeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MakeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MakeOrderButtonActionPerformed
        OrderProgress orderprogress = new OrderProgress();
        orderprogress.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MakeOrderButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String args[]) {
        int TotalPrice = MenuWindow.DisplayTotalPrice();
        String[] MenuItems = MenuWindow.DisplayMenuItems();
        for (int i = 0; i <= MenuItems.length;i++){
            System.out.println(i+" "+MenuItems[i]);
        }
        String newTP = Integer.toString(TotalPrice);
        
        orderFeild.setText("2");
        totalFeild.setText(newTP);
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new CheckOutWindow().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MakeOrderButton;
    private javax.swing.JLabel checkOutLabel;
    private javax.swing.JLabel grandtotalLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextArea orderFeild;
    private static javax.swing.JTextField totalFeild;
    private javax.swing.JLabel yourOrderLabel;
    // End of variables declaration//GEN-END:variables
}
