import java.util.*;
public class Palindromenumber 
{
    public static void main(String[] args) 
    {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int r,rev=0;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
            
        }System.out.println("reverse number = "+rev);
        if(rev==m){
            System.out.println("its a pelindrom number");
        }else{
            System.out.println("its not a pelindrom number");
        }

        
    }
    
}
