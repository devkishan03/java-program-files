import java.util.*;
public class Fibonacciseries 
{
    public static void main(String[] args) {
        System.out.println("enter the number of terms");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a+","+b+",");
        for(int i=0;i<n-2;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+",");
        }
    }
    
}
