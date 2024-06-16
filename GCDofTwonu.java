package Module_8;

import java.util.Scanner;

public class GCDofTwonu{
 
    static int Gcd(int a,int b){
        
        while(a!=b){
            if(a>b){
                a=a-b;
            }else if(b>a){
                b=b-a;
            }
            }
           return a;
    }
    


    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
           System.out.println("enter the number");
           int a=sc.nextInt();
           int b=sc.nextInt();
           sc.close();
           int c=Gcd(a,b);
          System.out.println(c);

    }
}
