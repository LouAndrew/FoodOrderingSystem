package Windows;

import javax.swing.SwingUtilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class CheckOutWindow extends javax.swing.JFrame {
    public static int TotalPrice;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CheckOutWindow.class.getName());

    /**
     * Creates new form CheckOutWindow
     */
    public CheckOutWindow() {
        initComponents();
        SwingUtilities.invokeLater(()->{
            String order;
            order = MenuWindow.orderType;
            TotalPrice = MenuWindow.TotalAmount;
            
            yourOrderFeild.setText(order);
            grandtotalFeild.setText("UGX "+TotalPrice);
            
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkOutLabel = new javax.swing.JLabel();
        MakeOrderButton = new javax.swing.JButton();
        yourOrderFeild = new javax.swing.JLabel();
        grandtotalLabel = new javax.swing.JLabel();
        yourOrderLabel1 = new javax.swing.JLabel();
        grandtotalFeild = new javax.swing.JLabel();

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

        yourOrderFeild.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        yourOrderFeild.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        grandtotalLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        grandtotalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grandtotalLabel.setText("Grand Total:");

        yourOrderLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        yourOrderLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yourOrderLabel1.setText("Your Order:");

        grandtotalFeild.setFont(new java.awt.Font("Berlin Sans FB", 0, 22)); // NOI18N
        grandtotalFeild.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MakeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkOutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(192, 192, 192))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(grandtotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yourOrderLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(yourOrderFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(grandtotalFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(checkOutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yourOrderFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yourOrderLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(grandtotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(grandtotalFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)))
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

    @SuppressWarnings("empty-statement")

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MakeOrderButton;
    private javax.swing.JLabel checkOutLabel;
    private static javax.swing.JLabel grandtotalFeild;
    private javax.swing.JLabel grandtotalLabel;
    private static javax.swing.JLabel yourOrderFeild;
    private static javax.swing.JLabel yourOrderLabel1;
    // End of variables declaration//GEN-END:variables
}
