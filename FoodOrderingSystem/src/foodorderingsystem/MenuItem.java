package foodorderingsystem;
public class MenuItem {
    private int itemID;
    private String itemName;
    private String description;
    private double price;
    private String category;
    
    public MenuItem(int itemID,String itemName,String description,double price,String category){
        this.itemID = itemID;
        this.itemName = itemName;
        this.description = description;
        this.price = price;
        this.category = category;
    }
    public int getItemID(){
        return itemID;
    }
    public String getItemName(){
        return itemName;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }
    public String getCategory(){
        return category;
    }
    public void setItemID(int itemID){
        this.itemID = itemID;
    }
    public void setItemName(String itemName){
        this.itemName =  itemName;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setCategory(String category){
        this.category = category;
    }
}
