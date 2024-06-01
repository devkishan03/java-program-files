package Module_7;

public class FindingMax {
    public static void main(String[] args) {
         int A[]={3,9,7,8,12,6,15,5,4,10,45};
         int Max=A[0];
         for(int i=0;i<A.length;i++){
              if(A[i]>Max){
                Max=A[i];
              }
         }
         System.out.println("the maximum element is "+Max);
    }
}
