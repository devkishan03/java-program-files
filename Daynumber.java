import java.util.*;
public class Daynumber 
{
    public static void main(String[] args) 
  {
     System.out.println("enter day number");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
       if(n==1){
        System.out.println("monday");
       }else if(n==2){
        System.out.println("tuesday");
       }else if(n==3){
        System.out.println("wednesday");
       }else if(n==4){
        System.out.println("thurasday");
       }else if(n==5){
        System.out.println("friday");
       }else if(n==6){
        System.out.println("saterday");
       }else if(n==7){
        System.out.println("sunday");
       }else{
        System.out.println("invalid number");
       }
}
    
}
