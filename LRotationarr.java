

public class LRotationarr 
{
    public static void main(String[] args) {
        int a[]={5,9,16,10,12,7,3,5,4,2};
        for(int x:a){
            System.out.print(x+",");
        }System.out.println();
        int temp=a[0];
        for(int i=1;i<=a.length-1;i++){
            a[i-1]=a[i];
           
           
        } a[a.length-1]=temp;
    for(int x:a){
          System.out.print(x+",");
    }
    
}
}