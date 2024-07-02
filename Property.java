package Module_9_Oops.GETSET;


class Rectangle{

    private int length;
    private int braith;


    public int getlength(){
        return length;
    }
    public int getbraith(){
        return braith;
    }
    public void setlength(int length){
          this.length=length;  
    }
    public void setbraith(int braith){
          this.braith=braith;  
    }
}

public class Property {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.setlength(10);
        r.setbraith(5);

       System.out.println(r.getlength());
        System.out.println(r.getbraith());
    }
}
