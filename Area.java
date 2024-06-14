package Module_8;

public class Area {
    static int area(int length,int braith){
        return length*braith;
    }
    static double area(double radious){
            return Math.PI*radious*radious;
    }
    public static void main(String[] args) {
        System.out.println(area(15,10));
        System.out.println(area(20));
    }
}
