import java.util.*;
public class Chlng5 
{
 public static void main(String[] args) 
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your marks");
    int m1=sc.nextInt();
    int m2=sc.nextInt();
    int m3=sc.nextInt();
    int avg=(m1+m2+m3)/3;
    System.out.println("your avg is " + avg);
    if(avg>=70){
        System.out.println("your grade is A");
    }else if(avg<70&&avg>=60){
        System.out.println("your grade is B");
    }else if(avg<60&&avg>=50){
        System.out.println("your grade is C");
    }else if(avg<50 && avg>=40){
        System.out.println("your grade is D");
    }else{
        System.out.println("your grade is F");
    }
 }


 }   

