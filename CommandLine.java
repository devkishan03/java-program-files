
public class CommandLine
{

  public static void main(String args[])

  {
     char c=args[0].charAt(0);
       
     int a=Integer.parseInt(args[1]);
     int b=Integer.parseInt(args[2]);

           switch(c){
             case '+':System.out.println(a+b);
                      break;
             case '-':System.out.println(a-b);
                      break;
             case '*':System.out.println(a*b);
                      break;
              case'/':System.out.println(a/b);
                      break;
              default:System.out.println("wrong operator input");
                      break;
              }





   }


}