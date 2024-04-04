public class Arrey
 {
    public static void main(String[] args) 
    {
      int a[]=new int[10];
      int b[]={1,2,3,4,5};
      int[]c={2,3,4,5,6};
      b[3]=10;
      
     // System.out.println(a.length);
      for(int x:a){
        System.out.print(x);
      }
      a[1]=2;
      for(int x:a){
        System.out.print(x);
      }
    //   System.out.println();
      
    //   for(int i=0;i<b.length;i++){
    //     System.out.println(b[i]++);
        
    //   }
    //   for (int x:b){
    //     System.out.print(x);
    //   }
} 
}
