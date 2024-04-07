public class MaxnumberVa 
{
    static int max(int ...a)
    {
        if(a.length==0){
            return Integer.MIN_VALUE;
        }
        int n=0;
        for(int i=0;i<a.length;i++){
            if (a[i]>n){
                 n=a[i];
            }
        }return n;
        
    }
    public static void main(String[] args)
     {
     System.out.println(max());
     System.out.println(max(1,2,300,4,6,7,8,9,56,43,23));
     
    }
}
