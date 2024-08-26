package Module_9_Oops.Method_overriding;
class Super
{
    public Super(){

    }

    public void display(){
        System.out.println("hello super class");
    }
}

class Sub extends Super
{
    public Sub(){

    }
   
    public void display(){
     System.out.println("hello world sub class");
    }
}


public class Overriding {
    public static void main(String[] args) {
        Super s=new Super();
        s.display();
                             //method overriding
        Sub s2=new Sub();
        s2.display();


        Super s3=new Sub();   //dynamicmethod dispatch
        s3.display();




    }
}
