import java.util.*;
public class Daynumberwithswitchcase 
{
 public static void main(String[] args) 
  {
    System.out.println("enter day number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    switch(n)
    {
               case 1:System.out.println("monday");
               break;
               case 2:System.out.println("tuesday");
               break;
               case 3:System.out.println("wednesday");
               break;
               case 4:System.out.println("thursday");
               break;
               case 5:System.out.println("friday");
               break;
               case 6:System.out.println("saterday");
               break;
               case 7:System.out.println("sunday");
               break;
               default :System.out.println("invalid number");
               break;
    }
    
  }   
}
