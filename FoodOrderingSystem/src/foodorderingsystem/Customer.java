package foodorderingsystem;
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
    public void insertIntoDB(){
        System.out.println(this.name+"\n"+this.deliveryAddress+"\n"+this.email+"\n"+this.phoneNumber);
    }
}


