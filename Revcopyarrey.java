public class Revcopyarrey 
{
    public static void main(String[] args) {
        int a[]={8,6,10,9,2,15,7,13,14,11};
        for(int x:a){
            System.out.print(x+",");
        }System.out.println();
        int b[]=new int[10];

        // for(int i=0;i<a.length;i++){
        //     b[b.length-1-i]=a[i];
        // }

          //or
               
          for(int i=0,j=a.length-1;i<a.length;i++,j--){
            b[i]=a[j];
          }
        for(int x:b){
            System.out.print(x+",");
        }
    }
    
}
