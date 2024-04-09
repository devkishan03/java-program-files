package Practice;
class product
{
    private String name;
    private int itemNo;
    private double price;
    private int quantity;

    public String getName(){
        return name;
    }
    public int getItemNo(){
        return itemNo;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public int setQuantity(int Quantity){
         return quantity=Quantity;
    }
    public double setPrice(Double Price){
        return price=Price;
    }
    public product(int itemno){
        itemNo=itemno;
    }
    public product(int itemno,String Name){
        itemNo=itemno;
        name=Name;
    }
    public product(int itemno,String Name,double Price,int Quantity){
        itemNo=itemno;
        name=Name;
        setPrice(Price);
        setQuantity(Quantity);
    }
    public String toString(){
        return("item no= "+itemNo+"\n"+"name= "+name+"\n"+"price="+price+"\n"+"quantity= "+quantity);
       }
}
class customer
{
    private String cId;
    private String name;
    private String address;
    private String phNo;

    public String getcId(){ return cId;}
    public String getname(){ return name;}
    public String getaddress(){ return address;}
    public String getphNo(){ return phNo;}

    public void setaddress(String address){
        this.address=address;
    }
    public void setphNo(String phNo){
        this.phNo=phNo;
    }
    public customer(String cId,String name){
        this.cId=cId;
        this.name=name;
        }
    public customer(String cId,String name,String address,String phNo){
        this.cId=cId;
        this.name=name;
        setaddress(address);
        setphNo(phNo);
    }
    public String toString(){
       return ("Customer id= "+cId+"\n"+"name= "+name+"\n"+"customer address= "+address+"\n"+"customer phNo= "+phNo);
    }

}
public class Constractorpractis {

    public static void main(String[] args) {
        product p=new product(01);
        product p1=new product(02,"keyboard");
        product p2=new product(03, "mouse", 200, 10);
        //p2.Pdetails();
        customer c=new customer("1234", "kishan");
        customer c1=new customer("12345", "kundan", "egra", "8348858105");
        System.out.println(c1);
        System.out.println();
        System.out.println(p2);
    
        
    }
}
