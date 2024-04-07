import java.util.*;
public class Multiplecationtable 
{
    public static void main(String[] args) 
    {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
            long f=1;  //we take long type data because factorial number is very much of big number.
          for(int i=1;i<=n;i++)
          {
               f=f*i;
         } System.out.println("factorial is "+f);
        
        
        
        
        
        
        
        
        
        //   table of any number
        // for( int i=1;i<=10;i++){
        //     System.out.println(n+"x"+i+"="+(n*i));
        // }
            //   sum of natural n numbers
        //     int sum=0;
        //     for(int i=1;i<=n;i++){
        //     sum=sum+i;
        // }System.out.println("sum of "+n+" number is= "+sum);
    
}
    
}
