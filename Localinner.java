package Module_9_Oops.Innerclass;
class Demo
{
    public void display(){
        class In
        {
            public void show(){
                System.out.println("hello");
            }
        }
        In i=new In();
        i.show();
    }
}
public class Localinner {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.display();
    }
}
