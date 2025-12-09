package Windows;

import foodorderingsystem.Customer;
import javax.swing.JOptionPane;

public class RegisterWindow extends javax.swing.JFrame {
    
    public static String name;
    public static String deliveryAddress;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RegisterWindow.class.getName());
    public RegisterWindow() {
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FOSLabel = new javax.swing.JLabel();
        RegisterDetailsLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        EmailFeild = new javax.swing.JTextField();
        UserNameLabel = new javax.swing.JLabel();
        UserNameFeild = new javax.swing.JTextField();
        PhoneNumberLabel = new javax.swing.JLabel();
        PhoneNumberField = new javax.swing.JTextField();
        DeliveryAddressLabel = new javax.swing.JLabel();
        DeliveryAddressFeild = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        PassWordLabel = new javax.swing.JLabel();
        PasswordFeild = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Food Ordering System");
        setBackground(new java.awt.Color(153, 255, 0));
        setResizable(false);

        FOSLabel.setBackground(new java.awt.Color(102, 0, 102));
        FOSLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        FOSLabel.setForeground(new java.awt.Color(102, 0, 102));
        FOSLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FOSLabel.setText("FOOD ORDERING SYSTEM");

        RegisterDetailsLabel.setBackground(new java.awt.Color(102, 0, 102));
        RegisterDetailsLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        RegisterDetailsLabel.setForeground(new java.awt.Color(102, 0, 102));
        RegisterDetailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisterDetailsLabel.setText("Register details");

        EmailLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        EmailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmailLabel.setText("Email:");

        EmailFeild.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        EmailFeild.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EmailFeild.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        UserNameLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        UserNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserNameLabel.setText("User name:");

        UserNameFeild.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        UserNameFeild.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserNameFeild.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PhoneNumberLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        PhoneNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PhoneNumberLabel.setText("Phone Number:");

        PhoneNumberField.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        PhoneNumberField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PhoneNumberField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        DeliveryAddressLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        DeliveryAddressLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeliveryAddressLabel.setText("Delivery Address:");

        DeliveryAddressFeild.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        DeliveryAddressFeild.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DeliveryAddressFeild.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SubmitButton.setBackground(new java.awt.Color(0, 102, 102));
        SubmitButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(102, 0, 102));
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        PassWordLabel.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        PassWordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PassWordLabel.setText("Password:");

        PasswordFeild.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        PasswordFeild.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PasswordFeild.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LoginButton.setBackground(new java.awt.Color(0, 153, 153));
        LoginButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(153, 0, 153));
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Already have an account?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(FOSLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(RegisterDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(UserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(PassWordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PasswordFeild))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(PhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(PhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(EmailFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(UserNameFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DeliveryAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DeliveryAddressFeild, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(SubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginButton)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(FOSLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(RegisterDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserNameFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeliveryAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeliveryAddressFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PassWordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(166, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(LoginButton)
                        .addGap(123, 123, 123))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed

        String email = EmailFeild.getText().trim();
        String Username = UserNameFeild.getText().trim();
        String phoneNumber = PhoneNumberField.getText().trim();
        String DeliveryAdd = DeliveryAddressFeild.getText().trim();
        String passWord = PasswordFeild.getText().trim();
        Customer cs = new Customer();
        cs.setCustomerEmail(email);
        cs.setCustomerName(Username);
        cs.setCustomerPhoneNumber(phoneNumber);
        cs.setCustomerDeliveryAddress(DeliveryAdd);
        cs.setCustomerID(passWord);
        name = UserNameFeild.getText();
        deliveryAddress = DeliveryAddressFeild.getText();
        if (!email.isEmpty() && !Username.isEmpty() && !phoneNumber.isEmpty() && !DeliveryAdd.isEmpty() && !passWord.isEmpty()){
            if (PasswordValidation(passWord) && PhoneNumberValidation(phoneNumber) && EmailValidation(email)){
                cs.insertIntoDB(12,Username,DeliveryAdd,phoneNumber,email,passWord);
                MenuWindow menu = new MenuWindow();
                menu.setVisible(true);
                this.dispose();
            }
            
        }else {
        JOptionPane.showMessageDialog(this, "Feilds are empty!", "Registering Error", JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        LoginWindow LW = new LoginWindow();
        LW.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LoginButtonActionPerformed
    private boolean PasswordValidation(String pass){
        if (pass.length() < 5){
            JOptionPane.showMessageDialog(this, "Password too short, 6 character reccomended!", "Password Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else{
            return true;
        }
    }
    private boolean PhoneNumberValidation(String number){
        if (number.matches(".*[a-zA-Z].*")){
            JOptionPane.showMessageDialog(this, "There is a error with the number, contains alphabet letters.", "Number Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else{
            if (number.length() < 10){
                JOptionPane.showMessageDialog(this, "Number is too short, should be 10 characters long.", "Number Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            else{
                return true;
            }   
        }
    }
    private boolean EmailValidation(String email){
        String sample = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        if (email.matches(sample.toLowerCase())){
            return true;
        }else{
            JOptionPane.showMessageDialog(this, "Email is incorrect.", "Email Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new RegisterWindow().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField DeliveryAddressFeild;
    private javax.swing.JLabel DeliveryAddressLabel;
    private static javax.swing.JTextField EmailFeild;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel FOSLabel;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel PassWordLabel;
    private static javax.swing.JTextField PasswordFeild;
    private static javax.swing.JTextField PhoneNumberField;
    private javax.swing.JLabel PhoneNumberLabel;
    private javax.swing.JLabel RegisterDetailsLabel;
    private javax.swing.JButton SubmitButton;
    private static javax.swing.JTextField UserNameFeild;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
