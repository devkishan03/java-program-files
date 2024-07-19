package Module_9_Oops.Innerclass;
abstract class My{
   abstract public void display();
}
class Outer{
    int x=10;
   
    public void meth1(){
    My m=new My(){
        public void display(){
            System.out.println("hi");
        }
    };
    m.display();
}
}
public class Anoynoumus{
    public static void main(String[] args) {
       Outer O=new Outer();
       O.meth1();
        
    }
}
