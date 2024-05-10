package Module_5;
import java.util.*;
public class SC1 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
         System.out.println("enter year");
         int year=sc.nextInt();
         
         if(year%4==0){
              if(year%100==0){
                  if(year%400==0){
                      System.out.println("its a leepyear");
                   }  
                     else
                         {
                          System.out.println("its not a leepyear");
                         }
              }
               else
                  {
                   System.out.println("its a leepyear");
                  }
         }
         else
            {
            System.out.println("its not a leapyear");
            }
   
   
   
   
   
   
                        //finding number    
      //   System.out.println("enter your number");
    //     String str=sc.nextLine();
    //     if(str.matches("[01]+")){
    //         System.out.println("its a binary number");
    //     }else if(str.matches("[0-7]+")){
    //         System.out.println("its a octal number");
    //     }else if(str.matches("[0-9A-F]+")){
    //         System.out.println("its a hexadecimal");
    //     }else if(str.matches("[0-9]+")){
    //         System.out.println("its a decimal number");
    //     }else{
    //         System.out.println("not a number");
    //     }



    sc.close();
    }
}
