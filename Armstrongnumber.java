import java.util.*;
public class Armstrongnumber 
{
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,r;
        int m=n;
        while(n>0){
            r=n%10;
          sum=sum+(r*r*r);
          n=n/10;
        }System.out.println(sum);
        if(m==sum){
           System.out.println("armstrong number");
        }else{
            System.out.println("not a amstrong number");
        }
    }
    
}
