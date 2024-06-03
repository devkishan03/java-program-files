package Module_7;

public class Leftrotation {
    public static void main(String[] args) {
        int A[]={3,9,7,8,12,6,15,5,4,10,45};
             
        for (int i : A) {
            System.out.print(i+",");
         }
        System.out.println();
         
        int temp=A[0];
        for(int i=1;i<A.length;i++){
            A[i-1]=A[i];
        }
         A[A.length-1]=temp;
        
         for (int i : A) {
            System.out.print(i+",");
         }
    }
}
