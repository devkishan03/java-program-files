import java.util.*;
public class Chalng4 
{
public static void main(String[] args) {
    System.out.println("enter the age");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(a<14){
     System.out.println("child");
      } else if(14<=a&&a<=55){
        System.out.println("young");
      } else{
        System.out.println("old");
      } 
}    
}
