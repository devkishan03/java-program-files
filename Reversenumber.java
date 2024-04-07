import java.util.*;
public class Reversenumber 
{
    public static void main(String[] args)
     {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,R=0;
        while(n>0){
            r=n%10;
            R=R*10+r;
            n=n/10;
            
        }System.out.println(R);
        
    }
    
}
