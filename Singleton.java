package Module_9_Oops.Singletonclass;
class Cofemachine
{ 
    private int cofepowder;
    private int milk;

    private static Cofemachine c=null;

    private Cofemachine(){
        cofepowder=1;
        milk=1;
    }

    static public Cofemachine getinstanse(){
          if(c==null)
                c=new Cofemachine();
                return c;
          
    }

    public void setCofepwder(int cofepowder){
        this.cofepowder=cofepowder;
    }
    public void setmilk(int milk){
       this.milk=milk;
    }

    public int getCofepwder(){
        return cofepowder;
    }
    public int getmilk(){
        return milk;
    }

}
public class Singleton {
    public static void main(String[] args) {
        Cofemachine c=Cofemachine.getinstanse();
        Cofemachine c2=Cofemachine.getinstanse();
        System.out.println(c.equals(c2));
    }
}
