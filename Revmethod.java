
public class Revmethod 
{
 static int Rev(int a){
   int R=0;
   while(a>0){
      int r=a%10;
       R=R*10+r;
       a=a/10;

   }return R;

  }

    static int [] Rev(int a[])
   { int b[]=new int[a.length];
     
   for(int i=a.length-1,j=0;i>=0;i--,j++)
      {
         b[j]=a[i];
      }return b;
   } 
    
 
    public static void main(String[] args) 
    {
     int a[]={1,2,3,4,5,6};
      int n=123456;
      int b[]=Rev(a);
      for (int x:b){
         System.out.print(x);
      }
      System.out.println();
      System.out.println(Rev(n));
   }
    
    
   
      
 }  

