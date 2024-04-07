public class Chalang1 
{
 public static void main(String[] args) 
 {
 String str="programmer@gmail.com";
//  find domain username and gmail or not
 int i1=str.lastIndexOf(".");
 int i=str.indexOf("@");
 System.out.println(str.substring(0,i));
 System.out.println(str.substring(i+1));
 String str1=str.substring(i+1, i1);
 System.out.println(str1.startsWith("gmail"));
 }   
}
