import javax.lang.model.util.ElementScanner14;

public class Chlng6 
{
  public static void main(String[] args)
   {
   String str="106759A";
   
    if(str.matches("[01]+")){
    System.out.println("its a binary number radex is 10");
   }else if(str.matches("[0-7]+")){
    System.out.println("its a octal number radex is 8");
   }else if(str.matches("[0-9]+")){
    System.out.println("its a decimal number radex is 2");
   }else if(str.matches("[0-9A-F]+")){
    System.out.println("its a hexa decimal number radex is 16");
   }else{
    System.out.println("invalid number");
   }
  }    
}
