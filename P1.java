package Practice;
import java.util.*;
public class P1 
{ static void call(int a,int b,int n){
    int sum=a;
    for(int i=0;i<n;i++){
        sum=sum+((int)Math.pow(2,i))*b;
        System.out.print(sum+" ");
    }
    
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int i=1;i<=t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            call(a, b, n);
            System.out.println();
        }



    }
    
}
