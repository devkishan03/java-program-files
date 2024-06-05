package Module_7;

public class FindingSecMax {
    public static void main(String[] args) {
         int A[]={3,4,5,2};

         int max=A[0], Smax=A[0];
         for(int i=0;i<A.length;i++){
            if(A[i]>max){
                Smax=max;
               max=A[i];
            }else if(A[i]>Smax){
                Smax=A[i];
            }
         }
         System.out.println("max number is "+max);
         System.out.println("Second max number is "+Smax);
    }
}
