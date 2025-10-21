package foodorderingsystem;
public class Customer {
    private int customerID;
    private String name;
    private String email;
    private String phoneNumber;
    private String deliveryAddress;
    
    
    public void Customer(int customerID,String name,String email,String phoneNumber,String deliveryAddress){
    this.customerID = customerID;
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.deliveryAddress = deliveryAddress;
    }
    //getters
    public int getCustomerID(){
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
    public void setCustomerID(int customerID){
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
    public void printAllInfo(){
        System.out.println(this.name+"\n"+this.deliveryAddress+"\n"+this.email+"\n"+this.phoneNumber);
    }
}


