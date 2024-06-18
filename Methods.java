package Module_8;
public class Methods {

   static int Max(int a,int b){
        if(a>b){
            return a;
        }else
        return b;
    }
     
    void Inc(int a){
        a++;
        System.out.println(a);
     }

     public static void main(String[] args) {
        int a=10,b=15,c;
       c= Max(a,b);
       System.out.println(c);

       Methods m=new Methods();
            m.Inc(a);
    }
}
