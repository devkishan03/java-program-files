import java.util.*;
public class Cubiod 
{
  public static void main(Stringp[] args) 
  {
   System.out.println("enter length,brath,height");
   Scanner sc=new Scanner(System.in);
   int Length=sc.nextInt();
   int Brath=sc.nextInt();
   int Height=sc.nextInt();
   int total_area=2*((Length*Height)+(Brath*Height)+(Length*Brath));
   int total_volume=(Length*Brath*Height);
   System.out.println("total area is-"+total_area);
   System.out.println("total volume is-"+total_volume);



  }  
}
