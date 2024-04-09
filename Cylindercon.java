package Practice;
class Cylinderc
{
    private int radious;
    private int height;

    public int getRadious(){
        return radious;
    }
    public int getHeight(){
        return height;
    }
    public void setRadious(int r){
        if(r>=0)
        radious=r;
        else
        radious=0;
    }
    public void setHeight(int h){
        if(h>=0)
        height=h;
        else
        height=0;
    }
    public Cylinderc(){
        setHeight(1);
        setRadious(1);
    }
    public Cylinderc(int r,int h){
        radious=r;
        height=h;
    }
    public Cylinderc(int r){
        radious=r;
        setHeight(1);
    }
    public int lidArea()
    {
        return (int)Math.PI*radious*radious;
    }
    public int totalSurfacearea()
    {
        return 2*lidArea()+circumferance()*height;
    }
    public int circumferance()
    {
        return 2*(int)Math.PI*radious;
    }
    public int volume()
    {
        return lidArea()*height;
    }
}
   


public class Cylindercon {
  public static void main(String[] args) {
    Cylinderc c1=new Cylinderc(3);
    System.out.println(c1.circumferance());
    System.out.println(c1.totalSurfacearea());
    System.out.println(c1.lidArea());
    System.out.println(c1.volume());
  }
}
