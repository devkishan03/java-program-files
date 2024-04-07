//import java.util.*;
public class Chlng2
 {
  public static void main(String[] args) {
   // Scanner sc=new Scanner(System.in);
    //int b=sc.nextInt();
    int b=10100;
    String str1="231F";
    String str2="17/11/1999";
    String str=String.valueOf(b);
    System.out.println(str.matches("[01]+"));
    System.out.println(str1.matches("[0-9A-F]+"));
    System.out.println(str2.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    
  }  
}
