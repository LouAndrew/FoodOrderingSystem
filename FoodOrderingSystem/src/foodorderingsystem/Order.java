package foodorderingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Order {
    private int orderID;
    private int customerID;
    private String orderType;
    private double totalAmount;
    private String orderStatus;
    
    public Order(int orderID,int customerID,String OrderType,double totalAmount,String orderStatus){
        this.orderID = orderID;
        this.customerID = customerID;
        this.orderType = OrderType;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
    }

    public Order() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public int getOrderID(){
        return orderID;
    }
    public int getCustomerID(){
        return customerID;
    }
    public String getOrderType(){
        return orderType;
    }
    public double getTotalAmount(){
        return totalAmount;
    }
    public String getOrderStatus(){
        return orderStatus;
    }
    
    public void setOrderID(int orderID){
        this.orderID = orderID;
    }
    public void setCustomerID(int customerID){
        this.customerID = customerID;
    }
    public void SetOrderType(String orderType){
        this.orderType = orderType;
    }
    public void setTotalAmount(double totalAmount){
        this.totalAmount = totalAmount;
    }
    public void setOrderStatus(String orderStatus){
        this.orderStatus = orderStatus;
    }
    public void InsertIntoDB(int id, int CustomerID, String orderType, double totalAmount, String orderStatus){
        String dbURL = "jdbc:derby:foodorderingsysdb;create= true";
       // jdbc:derby:D:/Database/foodorderingsysdb Embedded;create=true
        String query = "INSERT INTO ORDERTABLE VALUES (?,?,?,?,?,?)";
        
        try (Connection conn = DriverManager.getConnection(dbURL)){
             PreparedStatement pstmt = conn.prepareStatement(query);
            
            pstmt.setInt(1, id);
            pstmt.setInt(2, CustomerID);
            pstmt.setString(3, orderType);
            pstmt.setDouble(4, totalAmount);
            pstmt.setString(5, orderStatus);
            
            pstmt.executeUpdate();
            System.out.println("Order " + id + " " + orderType + " added successfully!");
            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
