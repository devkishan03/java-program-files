package Practice;
class Rectangle2
{ 
    private int length;
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
    public void setbraith(int b){
        if(b>=0)
        braith=b;
        else
        braith=0;
    }
             //constructors overloading//
    public Rectangle2(){
        setlength(1);
        setbraith(1);
    }
    public Rectangle2( int l,int b){
        setlength(l);
        setbraith(b);
    }
    public Rectangle2(int l){
       length=braith=l;
    }
           //          //
    public int area(){
        return length*braith;
    }
    public int perimeter(){
        return 2*(length+braith);
    }
    public boolean isSqure(){
        return length==braith;
    }

}

public class Construcrors {
    public static void main(String[] args) {
        Rectangle2 r=new Rectangle2();
        Rectangle2 r1=new Rectangle2();
        Rectangle2 r2=new Rectangle2(10,5);
        Rectangle2 r3=new Rectangle2(5);
       
        r1.setlength(12);
        r1.setbraith(6);
    
       
    }
}
