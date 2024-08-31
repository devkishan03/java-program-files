package Module_9_Oops.Classes;
  
class Myrectangle{

    public int length;
    public int braith;

    public Myrectangle(int length,int braith){
        this.length=length;
        this.braith=braith;

    }

    public int area(){
        return length*braith;
    }
    public int perimeter(){
        return 2*length+braith;
    }
}


public class Racetangle {
    public static void main(String[] args) {
        Myrectangle r=new Myrectangle(10,5);
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}
