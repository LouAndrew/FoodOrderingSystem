package Windows;
public class MenuWindow extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuWindow.class.getName());

    /**
     * Creates new form MenuWindow
     */
    public MenuWindow() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuLabel = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        drink1Button = new javax.swing.JRadioButton();
        drink2Button = new javax.swing.JRadioButton();
        drink3Button = new javax.swing.JRadioButton();
        drink4Button = new javax.swing.JRadioButton();
        snack1Button = new javax.swing.JRadioButton();
        snack2Button = new javax.swing.JRadioButton();
        snack3Button = new javax.swing.JRadioButton();
        snack4Button = new javax.swing.JRadioButton();
        meal1Button = new javax.swing.JRadioButton();
        meal2Button = new javax.swing.JRadioButton();
        meal3Button = new javax.swing.JRadioButton();
        meal4Button = new javax.swing.JRadioButton();
        desert1Button = new javax.swing.JRadioButton();
        desert2Button = new javax.swing.JRadioButton();
        desert3Button = new javax.swing.JRadioButton();
        desert4Button = new javax.swing.JRadioButton();
        drink1cost = new javax.swing.JLabel();
        drink2cost = new javax.swing.JLabel();
        drink3cost = new javax.swing.JLabel();
        drink4cost = new javax.swing.JLabel();
        snack1cost = new javax.swing.JLabel();
        snack2cost = new javax.swing.JLabel();
        snack3cost = new javax.swing.JLabel();
        snack4cost = new javax.swing.JLabel();
        meal1cost = new javax.swing.JLabel();
        meal2cost = new javax.swing.JLabel();
        meal3cost = new javax.swing.JLabel();
        meal4cost = new javax.swing.JLabel();
        desert1cost = new javax.swing.JLabel();
        desert2cost = new javax.swing.JLabel();
        desert3cost = new javax.swing.JLabel();
        desert4cost = new javax.swing.JLabel();
        drinksLabel = new javax.swing.JLabel();
        snacksLabel = new javax.swing.JLabel();
        mealsLabel = new javax.swing.JLabel();
        desertLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Food Ordering System");
        setBackground(new java.awt.Color(51, 51, 255));
        setResizable(false);

        MenuLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        MenuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuLabel.setText("MENU");

        SubmitButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 17)); // NOI18N
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        drink1Button.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        drink1Button.setText("Cocacola");
        drink1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink1ButtonActionPerformed(evt);
            }
        });

        drink2Button.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        drink2Button.setText("Sprite");
        drink2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink2ButtonActionPerformed(evt);
            }
        });

        drink3Button.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        drink3Button.setText("Water");
        drink3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink3ButtonActionPerformed(evt);
            }
        });

        drink4Button.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        drink4Button.setText("Fanta");
        drink4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink4ButtonActionPerformed(evt);
            }
        });

        snack1Button.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        snack1Button.setText("Crisps");
        snack1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snack1ButtonActionPerformed(evt);
            }
        });

        snack2Button.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        snack2Button.setText("Gonja");
        snack2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snack2ButtonActionPerformed(evt);
            }
        });

        snack3Button.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        snack3Button.setText("Groundnuts");
        snack3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snack3ButtonActionPerformed(evt);
            }
        });

        snack4Button.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        snack4Button.setText("Oreos");
        snack4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snack4ButtonActionPerformed(evt);
            }
        });

        meal1Button.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        meal1Button.setText("Fish & Chips");
        meal1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meal1ButtonActionPerformed(evt);
            }
        });

        meal2Button.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        meal2Button.setText("Pilau");
        meal2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meal2ButtonActionPerformed(evt);
            }
        });

        meal3Button.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        meal3Button.setText("Matooke");
        meal3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meal3ButtonActionPerformed(evt);
            }
        });

        meal4Button.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        meal4Button.setText("Pork chops");
        meal4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meal4ButtonActionPerformed(evt);
            }
        });

        desert1Button.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        desert1Button.setText("Yoghurt");
        desert1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desert1ButtonActionPerformed(evt);
            }
        });

        desert2Button.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        desert2Button.setText("Ice cream");
        desert2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desert2ButtonActionPerformed(evt);
            }
        });

        desert3Button.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        desert3Button.setText("Fruit pie");
        desert3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desert3ButtonActionPerformed(evt);
            }
        });

        desert4Button.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        desert4Button.setText("Asian jelly");
        desert4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desert4ButtonActionPerformed(evt);
            }
        });

        drink1cost.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        drink1cost.setText("UGX 2000");

        drink2cost.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        drink2cost.setText("UGX 2300");

        drink3cost.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        drink3cost.setText("UGX 1500");

        drink4cost.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        drink4cost.setText("UGX 2000");

        snack1cost.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        snack1cost.setText("UGX 3000");

        snack2cost.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        snack2cost.setText("UGX 5000");

        snack3cost.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        snack3cost.setText("UGX 6000");

        snack4cost.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        snack4cost.setText("UGX 5600");

        meal1cost.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        meal1cost.setText("UGX 15000");

        meal2cost.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        meal2cost.setText("UGX 10000");

        meal3cost.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        meal3cost.setText("UGX 9000");

        meal4cost.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        meal4cost.setText("UGX 20000");

        desert1cost.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        desert1cost.setText("UGX 4500");

        desert2cost.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        desert2cost.setText("UGX 7000");

        desert3cost.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        desert3cost.setText("UGX 30000");

        desert4cost.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        desert4cost.setText("UGX 5600");

        drinksLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        drinksLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        drinksLabel.setText("DRINKS");

        snacksLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        snacksLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        snacksLabel.setText("SNACKS");

        mealsLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        mealsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mealsLabel.setText("MEALS");

        desertLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        desertLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desertLabel.setText("DESERT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(drink2Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(drink2cost, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(drink3Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(drink3cost, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(drink4Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(drink4cost, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(drink1Button)
                                .addGap(18, 18, 18)
                                .addComponent(drink1cost, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(snack4Button)
                                .addGap(28, 28, 28)
                                .addComponent(snack4cost, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(snack1Button)
                                    .addComponent(snack2Button))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(snack2cost, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(snack1cost, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(snack3Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(snack3cost, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(meal2Button)
                                .addGap(42, 42, 42)
                                .addComponent(meal2cost, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(meal3Button)
                                .addGap(18, 18, 18)
                                .addComponent(meal3cost, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(meal4Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(meal4cost, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(meal1Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(meal1cost, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(desert4Button)
                                .addGap(18, 18, 18)
                                .addComponent(desert4cost, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(desert3Button)
                                .addGap(18, 18, 18)
                                .addComponent(desert3cost, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(desert2Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(desert2cost, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(desert1Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(desert1cost, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(MenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(drinksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(snacksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(mealsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(desertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(MenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drinksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(snacksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mealsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drink1Button)
                    .addComponent(snack1Button)
                    .addComponent(meal1Button)
                    .addComponent(desert1Button)
                    .addComponent(drink1cost)
                    .addComponent(snack1cost)
                    .addComponent(meal1cost)
                    .addComponent(desert1cost))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drink2Button)
                    .addComponent(snack2Button)
                    .addComponent(meal2Button)
                    .addComponent(desert2Button)
                    .addComponent(drink2cost)
                    .addComponent(snack2cost)
                    .addComponent(meal2cost)
                    .addComponent(desert2cost))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drink3Button)
                    .addComponent(snack3Button)
                    .addComponent(meal3Button)
                    .addComponent(desert3Button)
                    .addComponent(drink3cost)
                    .addComponent(snack3cost)
                    .addComponent(meal3cost)
                    .addComponent(desert3cost))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(snack4Button)
                    .addComponent(drink4Button)
                    .addComponent(meal4Button)
                    .addComponent(desert4Button)
                    .addComponent(drink4cost)
                    .addComponent(snack4cost)
                    .addComponent(meal4cost)
                    .addComponent(desert4cost))
                .addGap(92, 92, 92)
                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String[] menuItems = new String[17];
    private static int num = 0;
    private static int TotalCost = 0;
    private void drink1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink1ButtonActionPerformed
        String item = drink1Button.getText();
        int drink1cost = 2000;
        TotalCost = TotalCost + drink1cost;
        num = num + 1;
        if (num > 0){
            menuItems[num] = item;
        }else{
            menuItems[0] = item;
        }
    }//GEN-LAST:event_drink1ButtonActionPerformed

    private void drink4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink4ButtonActionPerformed
        String item = drink4Button.getText();
        int drink4cost = 2000;
        TotalCost = TotalCost + drink4cost;
        num = num + 1;
        if (num > 0){
            menuItems[num] = item;
        }else{
            menuItems[0] = item;
        }
    }//GEN-LAST:event_drink4ButtonActionPerformed

    private void snack1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snack1ButtonActionPerformed
        String item = snack1Button.getText();
        int snack1cost = 3000;
        TotalCost = TotalCost + snack1cost;
        num = num + 1;
        if (num > 0){
            menuItems[num] = item;
        }else{
            menuItems[0] = item;
        }
    }//GEN-LAST:event_snack1ButtonActionPerformed

    private void drink2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink2ButtonActionPerformed
        String item = drink2Button.getText();
        int drink21cost = 2300;
        TotalCost = TotalCost + drink21cost;
        num = num + 1;
        if (num > 0){
            menuItems[num] = item;
        }else{
            menuItems[0] = item;
        }
    }//GEN-LAST:event_drink2ButtonActionPerformed

    private void drink3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink3ButtonActionPerformed
        String item = drink3Button.getText();
        int drink3cost = 1500;
        TotalCost = TotalCost + drink3cost;
        num = num + 1;
        if (num > 0){
            menuItems[num] = item;
        }else{
            menuItems[0] = item;
        }
    }//GEN-LAST:event_drink3ButtonActionPerformed

    private void snack2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snack2ButtonActionPerformed
        String item = snack2Button.getText();
        int snack2cost = 5000;
        TotalCost = TotalCost + snack2cost;
        num = num + 1;
        if (num > 0){
            menuItems[num] = item;
        }else{
            menuItems[0] = item;
        }
    }//GEN-LAST:event_snack2ButtonActionPerformed

    private void snack3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snack3ButtonActionPerformed
        String item = snack3Button.getText();
        int snack3cost = 6000;
        TotalCost = TotalCost + snack3cost;
        num = num + 1;
        if (num > 0){
            menuItems[num] = item;
        }else{
            menuItems[0] = item;
        }
    }//GEN-LAST:event_snack3ButtonActionPerformed

    private void snack4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snack4ButtonActionPerformed
        String item = snack4Button.getText();
        int snack4cost = 5600;
        TotalCost = TotalCost + snack4cost;
        num = num + 1;
        if (num > 0){
            menuItems[num] = item;
        }else{
            menuItems[0] = item;
        }
    }//GEN-LAST:event_snack4ButtonActionPerformed

    private void meal1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meal1ButtonActionPerformed
        String item = meal1Button.getText();
        int meal1cost = 15000;
        TotalCost = TotalCost + meal1cost;
        num = num + 1;
        if (num > 0){
            menuItems[num] = item;
        }else{
            menuItems[0] = item;
        }
    }//GEN-LAST:event_meal1ButtonActionPerformed

    private void meal2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meal2ButtonActionPerformed
        String item = meal2Button.getText();
        int meal2cost = 10000;
        TotalCost = TotalCost + meal2cost;
        num = num + 1;
        if (num > 0){
            menuItems[num] = item;
        }else{
            menuItems[0] = item;
        }
    }//GEN-LAST:event_meal2ButtonActionPerformed

    private void meal3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meal3ButtonActionPerformed
        String item = meal3Button.getText();
        int meal3cost = 9000;
        TotalCost = TotalCost + meal3cost;
        num = num + 1;
        if (num > 0){
            menuItems[num] = item;
        }else{
            menuItems[0] = item;
        }
    }//GEN-LAST:event_meal3ButtonActionPerformed

    private void meal4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meal4ButtonActionPerformed
        String item = meal4Button.getText();
        int meal4cost = 20000;
        TotalCost = TotalCost + meal4cost;
        num = num + 1;
        if (num > 0){
            menuItems[num] = item;
        }else{
            menuItems[0] = item;
        }
    }//GEN-LAST:event_meal4ButtonActionPerformed

    private void desert1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desert1ButtonActionPerformed
        String item = desert1Button.getText();
        int desert1cost = 4500;
        TotalCost = TotalCost + desert1cost;
        num = num + 1;
        if (num > 0){
            menuItems[num] = item;
        }else{
            menuItems[0] = item;
        }
    }//GEN-LAST:event_desert1ButtonActionPerformed

    private void desert2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desert2ButtonActionPerformed
        String item = desert2Button.getText();
        int desert2cost = 7000;
        TotalCost = TotalCost + desert2cost;
        num = num + 1;
        if (num > 0){
            menuItems[num] = item;
        }else{
            menuItems[0] = item;
        }
    }//GEN-LAST:event_desert2ButtonActionPerformed

    private void desert3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desert3ButtonActionPerformed
        String item = desert3Button.getText();
        int desert3cost = 30000;
        TotalCost = TotalCost + desert3cost;
        num = num + 1;
        if (num > 0){
            menuItems[num] = item;
        }else{
            menuItems[0] = item;
        }
    }//GEN-LAST:event_desert3ButtonActionPerformed

    private void desert4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desert4ButtonActionPerformed
        String item = desert4Button.getText();
        int desert4cost = 5600;
        TotalCost = TotalCost + desert4cost;
        num = num + 1;
        if (num > 0){
            menuItems[num] = item;
        }else{
            menuItems[0] = item;
        }
    }//GEN-LAST:event_desert4ButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        int no = 1;
        System.out.println(TotalCost);
        while (no<menuItems.length){
            if (menuItems[no] != null){
                System.out.println(menuItems[no]);
            }
            no = no + 1;
        }
    }//GEN-LAST:event_SubmitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
        java.awt.EventQueue.invokeLater(() -> new MenuWindow().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MenuLabel;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JRadioButton desert1Button;
    private javax.swing.JLabel desert1cost;
    private javax.swing.JRadioButton desert2Button;
    private javax.swing.JLabel desert2cost;
    private javax.swing.JRadioButton desert3Button;
    private javax.swing.JLabel desert3cost;
    private javax.swing.JRadioButton desert4Button;
    private javax.swing.JLabel desert4cost;
    private javax.swing.JLabel desertLabel;
    private javax.swing.JRadioButton drink1Button;
    private javax.swing.JLabel drink1cost;
    private javax.swing.JRadioButton drink2Button;
    private javax.swing.JLabel drink2cost;
    private javax.swing.JRadioButton drink3Button;
    private javax.swing.JLabel drink3cost;
    private javax.swing.JRadioButton drink4Button;
    private javax.swing.JLabel drink4cost;
    private javax.swing.JLabel drinksLabel;
    private javax.swing.JRadioButton meal1Button;
    private javax.swing.JLabel meal1cost;
    private javax.swing.JRadioButton meal2Button;
    private javax.swing.JLabel meal2cost;
    private javax.swing.JRadioButton meal3Button;
    private javax.swing.JLabel meal3cost;
    private javax.swing.JRadioButton meal4Button;
    private javax.swing.JLabel meal4cost;
    private javax.swing.JLabel mealsLabel;
    private javax.swing.JRadioButton snack1Button;
    private javax.swing.JLabel snack1cost;
    private javax.swing.JRadioButton snack2Button;
    private javax.swing.JLabel snack2cost;
    private javax.swing.JRadioButton snack3Button;
    private javax.swing.JLabel snack3cost;
    private javax.swing.JRadioButton snack4Button;
    private javax.swing.JLabel snack4cost;
    private javax.swing.JLabel snacksLabel;
    // End of variables declaration//GEN-END:variables
}
