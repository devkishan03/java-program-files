import java.util.*;
public class Numberinwordm2 
{

    public static void main(String[] args) 
    {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=""+n;
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            switch(c)
            {
                case'0':System.out.print("zero ");
                break;
                case '1':System.out.print("one ");
                break;
                case '2':System.out.print("two ");
                break;
                case '3':System.out.print("three ");
                break;
                case '4':System.out.print("four ");
                break;
                case '5':System.out.print("five ");
                break;
                case '6':System.out.print("six ");
                break;
                case '7':System.out.print("seven ");
                break;
                case '8':System.out.print("eight ");
                break;
                case '9':System.out.print("nine ");
                break;
                default :System.out.print("not a number ");
                break;
            }
        
      }
    
    }

}