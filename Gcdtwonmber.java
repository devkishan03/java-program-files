

public class Gcdtwonmber 
{  static int gcd(int m,int n)
    {
        while(m!=n){
            if(m>n)m=m-n;
            else n=n-m;
        }
        return n;
        
       

    }




    public static void main(String[] args) 
    {
        int a=35,b=15;
        System.out.println(gcd(a,b));
    }
    
}
