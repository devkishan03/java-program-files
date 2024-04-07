public class Method {
    // static int max(int x, int y)
    // {
    // if (x>y)
    //   return x;
    //   else 
    //   return y;
    // }
          //parameter passing
   static void inc(int x)
    {
        x++;
        System.out.println(x);
    }
 public static void main(String[] args) {
    int a=10,b=5,c;
    //System.out.println(max(a,b));
    // c=max(a,b);
    // System.out.println(c);
         //this a value is pass to 'x' when we call it.
    inc(a);
    System.out.println(a);
 }
    
}
