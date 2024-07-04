package Module_9_Oops.Abstractclass;
abstract class Shape
{

   abstract public double area();
   abstract public double perimeter();

}

class Circle extends Shape
{
    public double radious;
   
    public double area(){
      return Math.PI*radious*radious;
   }
   
   public double perimeter(){
    return 2*Math.PI*radious;
   }
}

class Rectangle extends Shape
{

    public int length;
    public int breadth;
    public double area(){
      return length*breadth;
   }
   
   public double perimeter(){
    return 2*(length+breadth);
   }
}
public class Abstract {
    public static void main(String[] args) {
        Circle s=new Circle();
        s.radious=10;
       System.out.println(s.area());
       System.out.println(s.perimeter());
    }
}
