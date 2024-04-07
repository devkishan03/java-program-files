

public class Methodprimenumber 
{
    static boolean prime(int n)
    {
        for (int i=2;i<n/2;i++)
        {
        if (n%i==0)
        return false;
        }
        return true;
        
    } 
        public static void main(String[] args) {
            int n=91;
            System.out.println(prime(n));
            
            
            

        }
    
    
}
