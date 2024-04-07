import java.util.*;

public class Calenderlyp
 {
   public static void main(String[] args) 
   {System.out.println("plese enter year");
    Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
          if(a%4==0){
              if(a%100==0){
                 if(a%400==0){
                    System.out.println("leapyear");
                     }
                     else
                    {
                     System.out.println("not leapyear");
                      }

                }
                 else 
                {
                 System.out.println("leapyear");
                  }
           }
            else
                {
                System.out.println("not leapyear");
                }
   
    } 
 }
