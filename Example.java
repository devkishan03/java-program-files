package Module_9_Oops.Constructor_inheritence;
class Rectangle
{
    int length;
    int braith;
    int x=10;

    public Rectangle(){
        length=braith=1;
    }
    public Rectangle(int l,int b){
        length=l;
        braith=b;
    }

    public int area(){
        return length*braith;
    }
    public int perimeter(){
          return 2*length+braith;
    }

}


class Couboid extends Rectangle
{
    int height;
    int x=20;

    public Couboid(){
        height=1;
    }
    public Couboid(int h){
          height=h;
    }
    public Couboid(int l,int b,int h){
         super(l,b);
          height=h;
    }

    public int volume(){
       return area()*height;
    }
}



public class Example {
    public static void main(String[] args){
        Rectangle r=new Rectangle();
        Couboid c=new Couboid(10,8,5);
        
        System.out.println(c.area());
        System.out.println(c.volume());
        System.out.println(c.x);
        System.out.println(r.x);


    }
}
