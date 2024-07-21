package Module_9_Oops.Innerclass;

class Outer
{
    int x=10;
    class Inner
    {
        int y=20;
        public void display(){
            System.out.println(x+" "+y);
        }
    }

    public void outerdisplay(){
        Inner i=new Inner();
        System.out.println(i.y);
    }

}
public class Nestedinnerclass {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.outerdisplay();
        Outer.Inner i=new Outer().new Inner();
        System.out.println(i.y);
    }
}
