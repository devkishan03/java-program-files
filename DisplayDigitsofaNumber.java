package Module_6;
import java.util.*;
public class DisplayDigitsofaNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
         sc.close();
        int num=0;
        int m=0;
        while(n>0){
           num=n%10;
          m=m*10+num;
           n=n/10;
 
        }
        int num2=0;
       while(m>0){
        num2=m%10;
        System.out.println(num2);
        m=m/10;
       }
    }
}
