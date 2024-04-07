public class Swapping 
{
    public static void main(Stringp[] args) 
    {
        // swapping
    //  int a,b;
    //  a=9;
    //  b=12;
    //  a=a^b;
    //  b=a^b;
    //  a=a^b;
    //  System.out.println(a);
    //  System.out.println(b);   
    

    // marging
    byte a=9, b=12, c;
     c=(byte)(a<<4);
     c=(byte)(c|b);

     System.out.println((c&0b11110000)>>4);
     System.out.println((c&0b00001111));
    }
    
}
