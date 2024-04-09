package Practice;

public class Rectangle 
{
    public int length;
    public int breath;
  
    public int area()
    {
      return length*breath;
    }   
    public int perimeter()
    {
      return 2*(length+breath);
    }
    public  boolean isSqure()
    {
      return length==breath;
   }
}
  class REctangletest
{
   public static void main(String[] args) 
   {
    Rectangle r1=new Rectangle();
    Rectangle r2=new Rectangle();
    r1.breath=5;
    r1.length=10;
    r2.breath=15;
    r2.length=15;
    System.out.println(r1.area());
    System.out.println(r1.perimeter());
    System.out.println(r1.isSqure());

    System.out.println(r2.area());
    System.out.println(r2.perimeter());
    System.out.println(r2.isSqure());
   }
}
