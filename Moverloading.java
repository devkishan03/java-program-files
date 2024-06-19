package Module_8;

public class Moverloading {
    
    static int max(int a,int b){
        return a>b?a:b;
    }
    static float max(float a,float b){
        return a>b?a:b;
    }
    static int max(int a,int b,int c){
        return a>b&&a>c ?a:(b>c?b:c);
    }



    public static void main(String[] args) {
        int a=10, b=30,c=25;
        
        float f1=25.6f,f2=35.5f;
           
          System.out.println(max(a,b,c));
        
          System .out .println(max(f1,f2));
           
    }
}
