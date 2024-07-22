package Module_9_Oops.Innerclass;
class Show
{
    int x=10;
    static int y=20;
    static class New{
        public void meth(){
            System.out.println("hello "+y);
        }
    }
}

public class Staticinn{
    public static void main(String[] args) {
        Show.New i=new Show.New();
        i.meth();
    }
}
