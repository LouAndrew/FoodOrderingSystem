package foodorderingsystem;
public class Payment {
    private int paymentID;
    private int orderID;
    private String paymentMethod;
    private double amount;
    private String paymentDate;
    
    public Payment(int paymentID,int orderID,String paymentMethod,double amount,String paymentDate){
        this.paymentID = paymentID;
        this.orderID = orderID;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }
    public int getPaymentID(){
        return paymentID;
    }
    public int getOrderID(){
        return orderID;
    }
    public String getPaymentMethod(){
        return paymentMethod;
    }
    public double getAmount(){
        return amount;
    }
    public String getPaymentDate(){
        return paymentDate;
    }
    public void setPaymentID(int paymentID){
        this.paymentID = paymentID;
    }
    public void setOrderID(int orderID){
        this.orderID = orderID;
    }
    public void setPaymentMethod(String paymentMethod){
        this.paymentMethod = paymentMethod;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public void setPaymentDate(String paymentDate){
        this.paymentDate = paymentDate;
    }
}
