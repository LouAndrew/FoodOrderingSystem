package foodorderingsystem;
public class orderDetail {
    private int orderDetailID;
    private int orderID;
    private int itemID;
    private int quantity;
    private double price;
    
    public orderDetail(int orderDetailID,int orderID,int itemID,int quantity,double price){
        this.orderDetailID = orderDetailID;
        this.orderID = orderID;
        this.itemID = itemID;
        this.quantity = quantity;
        this.price = price;
    }
    public int getOrderDetailID(){
        return orderDetailID;
    }
    public int getOrderID(){
        return orderID;
    }
    public int getItemID(){
        return itemID;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }
    
    public void setOrderDetailID(int orderDetailID){
        this.orderDetailID = orderDetailID;
    }
    public void setOrderID(int orderID){
        this.orderID = orderID;
    }
    public void setItemID(int itemID){
        this.itemID = itemID;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setPrice(double price){
        this.price  = price;
    }
}
