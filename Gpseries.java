import java.util.*;
public class Gpseries
 {
    public static void main(String[] args) {
        System.out.println("enter the initial number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter the common difference");
        int d=sc.nextInt();
        System.out.println("enter how meny terms");
        int n=sc.nextInt();
        System.out.println("GP series of "+a+" is = ");

        for(int i=1;i<=n;i++){
            System.out.print(a+", ");
            a=a*d;
        }
    }
    
}
