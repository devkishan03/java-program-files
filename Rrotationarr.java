public class Rrotationarr 
{
    public static void main(String[] args) {
        int a[]={5,9,16,10,12,7,3,5,4,2};
        for(int x:a){
            System.out.print(x+",");
         } 
         int temp=a[a.length-1];
            System.out.println();
             for(int i=a.length-1;i>0;i--){
                a[i]= a[i-1];
              
              
             }a[0]=temp;
             for(int x:a){
                System.out.print(x+",");
             }
            
               
            }
            
        }
    
    

