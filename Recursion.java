public class Recursion 
{
 static void rec(int x){
     if(x>0){
        
        System.out.println(x);
        rec(x-1);
     }
 }   
 public static void main(String[] args) {
    rec(3);
 }
}
