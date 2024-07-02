package Module_9_Oops.Constructor_inheritence;
class Super
{
    public Super(){
        System.out.println("Super class non param constructor ");
    }
    public Super(int x,int y){
        System.out.println("Super class param constructor "+x+" "+y);
    }
}

class Sub extends Super
{
    public Sub(){
        System.out.println("Sub class non param constructor ");
    }
    public Sub(int x){
        System.out.println("Sub class param constructor "+x);
    }
    public Sub(int x,int y,int z){
        super(x,y);
        System.out.println("Sub class param constructor "+z);
    }
}



public class Paramitarisedconst {
    public static void main(String[] args) {
       Sub s=new Sub(10,20,15);

    }
}
