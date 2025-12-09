package foodorderingsystem;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class Customer {
    private String customerID;
    private String name;
    private String email;
    private String phoneNumber;
    private String deliveryAddress;
    
    
    public void Customer(String customerID,String name,String email,String phoneNumber,String deliveryAddress){
    this.customerID = customerID;
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.deliveryAddress = deliveryAddress;
    }
    //getters
    public String getCustomerID(){
        return customerID;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getDeliveryAddress(){
        return deliveryAddress;
    }
    //setters
    public void setCustomerID(String customerID){
        this.customerID = customerID;
    }
    public void setCustomerName(String CustomerName){
        this.name = CustomerName;
    }
    public void setCustomerEmail(String customerEmail){
        this.email = customerEmail;
    }
    public void setCustomerPhoneNumber(String customerPhoneNumber){
        this.phoneNumber = customerPhoneNumber;
    }
    public void setCustomerDeliveryAddress(String customerDeliveryAddress){
        this.deliveryAddress = customerDeliveryAddress;
    }
    
    public void insertIntoDB(int id, String name, String address, String number, String email,String password){
        String dbURL = "jdbc:derby:foodorderingsysdb;create= true";
        String query = "INSERT INTO CUSTOMERTABLE VALUES (?,?,?,?,?,?)";
        
        try (Connection conn = DriverManager.getConnection(dbURL); 
             PreparedStatement pstmt = conn.prepareStatement(query)){
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, address);
            pstmt.setString(4, number);
            pstmt.setString(5, email);
            pstmt.setString(6,password);
            
            pstmt.executeUpdate();
            System.out.println("Customer " + name + " " + address + " added successfully!");
            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


