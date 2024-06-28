package Module_9_Oops.Constructors;

class Product{
    private String itemname;
    private String itemno;
    private int quantity;
    private double price;
     
    public Product(String itemname){
        this.itemname=itemname;
       
     }
    public Product(String itemname,String itemno){
        this.itemname=itemname;
        this.itemno=itemno;
      
    }
    public Product(String itemname,String itemno,int quantity,double price){
        this.itemname=itemname;
        this.itemno=itemno;
        this.quantity=quantity;
        this.price=price;
    }
    public String getItemname(){
        return itemname;
    }
    public String getItemno(){
        return itemno;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getprice(){
        return price;
    }
}



public class PropertyandMethod {
    public static void main(String[] args) {
        
    }
}
