public class Increasearreysize 
{
    public static void main(String[] args) {
        int a[]={8,6,10,9,2};
        int b[]=new int[2*a.length];
        System.out.println(a.length);
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        a=b;
        b=null;
        for(int x:a){
            System.out.print(x+",");
        }System.out.println();
        System.out.println(a.length);
    
      
    
    }
    
}
