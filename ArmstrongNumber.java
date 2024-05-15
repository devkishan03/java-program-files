package Module_6;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int m=sc.nextInt();
        int n=m;
        sc.close();
        int num=0;
        int Qube=0;
        
        while (n>0) {
          num=n%10;
          Qube= Qube+num*num*num;
          n=n/10;
        }
        
        if(m==Qube){
          System.out.println("The number "+m+" is an Armstrong number");
        }else{
          System.out.println("The number "+m+" is not an Armstrong number");
        }
       
    }
}
