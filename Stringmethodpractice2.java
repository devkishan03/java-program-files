public class Stringmethodpractice2 
{
    public static void main(String[] args) 
    {
        String str="www.abcd.org";
        // start with method
        System.out.println(str.startsWith("www"));
        // start with m2 it will show massage "true and false" so it is in boolean type.
        // boolean b=str.startsWith("abcd");
        // System.out.println(b);
        // end with method
        System.out.println(str.endsWith("org"));
        boolean b2=str.endsWith("abcd");
        System.out.println(b2);
        // to find char with index
        System.out.println(str.charAt(4));
        // m2
       char a=str.charAt(3);
       System.out.println(a);
       //  to find index number from first.
       System.out.println(str.indexOf("b"));
        int x=str.indexOf(".",4);
        System.out.println(x);
        // to find index number from last
        System.out.println(str.lastIndexOf(".",4));
        // if index is not available
        System.out.println(str.lastIndexOf("@", 2));


        
    }
    
}
