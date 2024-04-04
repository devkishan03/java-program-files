public class Areamethod 
{ static float area(float x,float y)
    {
    float z=x*y;
    return z;
    }
    static double area(double x)
    {
        double z=Math.PI*x*x;
        return z;
    }
    public static void main(String[] args) {
        System.out.println(area(5));
    }
}
    

