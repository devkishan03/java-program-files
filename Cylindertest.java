package Practice;
import java.util.*;
 class Cylinder
{ 
    public int radius;
    public int height;

    public int lidArea()
    {
        return (int)Math.PI*radius*radius;
    }
    public int totalSurfacearea()
    {
        return 2*lidArea()+circumferance()*height;
    }
    public int circumferance()
    {
        return 2*(int)Math.PI*radius;
    }
    public int volume()
    {
        return lidArea()*height;
    }
}

public class Cylindertest 
{
    public static void main(String[] args) 
    {
        Cylinder c1=new Cylinder();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("insert radious");
        c1.radius=sc.nextInt();
        System.out.println("insert height");
        c1.height=sc.nextInt();

        System.out.println("lid Area= "+c1.lidArea());
        System.out.println("circumferance= "+c1.circumferance());
        System.out.println("total surfacearea= "+c1.totalSurfacearea());
        System.out.println("volume= "+c1.volume());
        
    }
}
