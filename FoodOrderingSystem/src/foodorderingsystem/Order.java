package foodorderingsystem;
public class Order {
    private int orderID;
    private int customerID;
    private String orderDate;
    private double totalAmount;
    private String orderStatus;
    
    public Order(int orderID,int customerID,String orderDate,double totalAmount,String orderStatus){
        this.orderID = orderID;
        this.customerID = customerID;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
    }
    public int getOrderID(){
        return orderID;
    }
    public int getCustomerID(){
        return customerID;
    }
    public String getOrderDate(){
        return orderDate;
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
    public void setOrderDate(String orderDate){
        this.orderDate = orderDate;
    }
    public void setTotalAmount(double totalAmount){
        this.totalAmount = totalAmount;
    }
    public void setOrderStatus(String orderStatus){
        this.orderStatus = orderStatus;
    }
}
