package Module_8;

public class Maxelementarray {
     
   static int largeelement(int a[]){
        int x=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>x)
            x=a[i];
        }
        return x;
   }



    public static void main(String[] args) {
        int a[]={1,2,3,4,3,5,6,12,233,45,45};
       System.out.println( largeelement(a));
    }
}
