package Module_9_Oops.Dynamic_method_dispatch;
class Super
{
    public void method1(){
        System.out.println("Super class meth1");
    }
    public void method2(){
        System.out.println("Super class meth2");
    }
}

class Sub extends Super
{
    @Override
    public void method2(){
        System.out.println("Sub class meth2");
    }
    public void method3(){
         System.out.println("Sub class meth3");
    }
}
public class Example {
    public static void main(String[] args) {
        Super s=new Super();
        s.method1();
        s.method2();

       System.out.println();

        Sub s2=new Sub();

        s2.method1();
        s2.method2();
        s2.method3();

        Super s3=new Sub();

        s3.method1();
        s3.method2();      //dynamic method dispatch
       

    }
}
