public class Variablearg 
{
   static void show(int ...a)
 {
       for(int x:a){
        System.out.println(x);
       }
 }
    public static void main(String[] args) {
      int a=12,b=20,c=34;
      show(a,b,c);
      show(new int[]{1,2,3,4,5,6,7});
 }
}
