import java.util.*;
class First 
{
        public static void main(Stringp[]args) 
    {
        System.out.println("enter first number");
        Scanner sc=new Scanner(System .in);
        // float a=sc.nextFloat();
        // float h=sc.nextFloat();
        // float area=(a+h)/2;
        // System.out.println("total is"+area);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float f=(a+b+c)/2f;
        //f=area
        double area=Math.sqrt(f*(f-a)*(f-b)*(f-c));
        System.out.println(area);
        
    

    }
}