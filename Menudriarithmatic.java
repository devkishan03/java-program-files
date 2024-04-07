import java.util.*;
public class Menudriarithmatic 
{
    public static void main(String[] args) 
    {   System.out.println("enter two numbers");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        sc.nextLine();
        System.out.println("enter your option ADD,SUB,MUL,DIV ");
        String str=sc.nextLine();
        str=str.toUpperCase();
        switch(str)
        {
             case "ADD":System.out.println(n1+n2);
             break;
             case "SUB":System.out.println(n1-n2);
             break;
             case "MUL":System.out.println(n1*n2);
             break;
             case "DIV":System.out.println(n1/n2);
             break;
             default :System.out.println("invalid opration");
             break;

        }
}
}