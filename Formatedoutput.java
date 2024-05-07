package Module_4;

public class Formatedoutput {
    public static void main(String[] args) {
        int x=10;
        float f=12.50f;
        char a='A';
        String str="hello";
       // System.out.printf("hello %d %f %c world",x,f,a);

        System.out.printf("%1$d %2$f %3$s",x,f,str);
    }
}
