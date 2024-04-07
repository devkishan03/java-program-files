import java.util.*;
public class Displaydigits 
{
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int count=0;
        while(n>0){
        //   r=n%10;
          n=n/10;
          count++;
         

        } System.out.println(count);
    }
    
}
