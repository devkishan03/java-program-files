import java.util.*;
public class Webtypeswitch 
{
    public static void main(String[] args) 
    {System.out.println("enter a website");
    Scanner sc=new Scanner(System.in);

    String str=sc.nextLine();
    String str1=str.substring(str.lastIndexOf('.')+1);
    
    switch(str1)
    {
        case "com":System.out.println("commercial");
        break;
        case "gov":System.out.println("government");
        break;
        case "net":System.out.println("network");
        break;
        case "org":System.out.println("organization");
        break;
        default :System.out.println("invalid");
        break;


    }
}
    
}
