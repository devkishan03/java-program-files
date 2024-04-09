//import java.lang.Package;
 package Practice;
class Rectangle1
{ private int length;
  private int braith;

  public int getlength(){
    return length;
  }
  public int getbraith(){
    return braith;
  }
  public void setlength(int l){
    if(l>=0)
        length=l;
        else
        length=0;
  }
  public void setbraith( int b){
    if(b>=0)
    braith=b;
    else
    braith=0;
  }

  public int area(){
    return length*braith;
  }
  public int perimeter(){
    return 2*(length+braith);
  }

}
public class Datahiding 
{
    public static void main(String[] args) {
        Rectangle1 r=new Rectangle1();
          // System.out.println("length is= "+r.getlength());
          // System.out.println("braith is= "+r.getbraith());
          r.setlength(10);
          r.setbraith(5);
        System.out.println("area is = "+r.area());
        System.out.println("perimeter is = "+r.perimeter());
    }
}
