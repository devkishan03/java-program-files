import java.util.*;
public class Test 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           int a=sc.nextInt();
           int b=sc.nextInt();
           int n=sc.nextInt();
           int pow=0;
           for(int i=0;i<=n;i++){
           
               pow=(int)Math.pow(2, i);
               a=a+(pow*b);
               System.out.println(a);
            }
            }

    }



    
        
    

    

