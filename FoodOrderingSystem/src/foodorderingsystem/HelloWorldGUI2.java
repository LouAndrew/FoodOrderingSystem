package foodorderingsystem;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloWorldGUI2 {
    protected static int WindowNum = 1;
    protected static int num = 0;
    private static class WelcomeDisplay extends JPanel {
        @Override
        public void paintComponent(Graphics welcomeMessage) {
            super.paintComponent(welcomeMessage);
            welcomeMessage.drawString("Welcome to AlibinAladin food ordering system!", 110, 30 );
            welcomeMessage.drawString("Press Continue to proceed!", 160, 300);
        }
    }
    private static class UserDataCollect extends JPanel {
        @Override
        public void paintComponent(Graphics Feilds) {
            super.paintComponent(Feilds);
            Feilds.drawString("User Name: ", 20, 30 );
            Feilds.drawString("User Email: ", 20, 40);
            Feilds.drawString("User PhoneNumber: ", 20, 50);
            Feilds.drawString("User DeliveryAddress: ", 20, 60);
        }
    }
    private static class MenuItemsDisplay extends JPanel {
        @Override
        public void paintComponent(Graphics MenuItem) {
            super.paintComponent(MenuItem);
        }
    }
    private static class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            WindowNum += 1;
            System.out.println(WindowNum);
            FOSystem.ChangeWindow();
        }
    }
    protected static class FOSystem {
        protected static JFrame window = new JFrame("FOOD ORDERING SYSTEM..");
        protected static JPanel content = new JPanel();
        protected static JButton CustomerButton = new JButton("Customer");
        public void DrawWindow(){
            ButtonHandler listen = new ButtonHandler();
            CustomerButton.addActionListener(listen);
            window.setContentPane(content);
            window.setSize(500,400);
            window.setLocation(400,300);
            window.setVisible(true);
            ChangeWindow();
        }
        protected static void ChangeWindow(){
            switch (WindowNum) {
                case 1:
                    window1();
                    System.out.println("window1");
                    break;
                case 2:
                    content.removeAll();
                    window2();
                    System.out.println("window2");
                    break;
                case 3:
                    content.removeAll();
                    window3();
                    System.out.println("window3");
                    break;
                default:
                    break;
            }
        }
        private static void window1(){
            WelcomeDisplay displayPanel = new WelcomeDisplay();
            
            content.setLayout(new BorderLayout());
            content.add(displayPanel, BorderLayout.CENTER);
            content.add(CustomerButton, BorderLayout.SOUTH);
     
            window.setContentPane(content);
        }
        private static void window2(){
            UserDataCollect displayPanel = new UserDataCollect();
            JButton SubmitButton = new JButton("Submit");
            ButtonHandler listen = new ButtonHandler();
         
            SubmitButton.addActionListener(listen);
            content.setLayout(new BorderLayout());
            content.add(displayPanel, BorderLayout.CENTER);
            content.add(SubmitButton, BorderLayout.SOUTH);
     
            window.setContentPane(content);
        }
        private static void window3(){
            MenuItemsDisplay displayPanel = new MenuItemsDisplay();
            JButton SubmitButton = new JButton("Submit");
            ButtonHandler listen = new ButtonHandler();
     
            SubmitButton.addActionListener(listen);
     
            content.setLayout(new BorderLayout());
            content.add(displayPanel, BorderLayout.CENTER);
            content.add(SubmitButton, BorderLayout.SOUTH);
     
            window.setContentPane(content);
        }
    }
    public static void main(String[] args) {
        FOSystem FOS = new FOSystem();
        FOS.DrawWindow();
    }
}