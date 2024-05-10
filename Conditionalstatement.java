package Module_5;
import java.util.*;
public class Conditionalstatement {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter your 3 sub marks");
       float s1=sc.nextFloat();
       float s2=sc.nextFloat();
       float s3=sc.nextFloat();

       float avg=(s1+s2+s3)/3;

       if(70<=avg){
           System.out.println("A grade");
       }else if(70>avg && avg>=60){
        System.out.println("B grade");
       }else if(60>avg && avg>=50){
        System.out.println("C grade");
       }else if(50>avg && avg>=40){
        System.out.println("D grade");
       }else{
          System.out.println("F");
       }


       




                  //young or not  
    //    System.out.println("enter the age");

    //     int n=sc.nextInt();

    //     if(14<=n&&n<=45){
    //         System.out.println("you are young");
    //     }else{
    //         System.out.println("you are not young");
    //     }

       




   
                 //odd even   
       //    System.out.println("enter any number");
    //    int n=sc.nextInt();
       
    //    if(n%2==0){
    //     System.out.println("this is even number:"+n);
    //    }else{
    //     System.out.println("this is odd number:"+n);
    //    }

       sc.close();





    }
}
