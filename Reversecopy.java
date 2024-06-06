package Module_7;

public class Reversecopy {
    public static void main(String[] args) {
        int A[]={2,4,6,7,9,3,4,5,6,7,9};
        int B[]=new int[A.length];

        for (int i : A) {
            System.out.print(i+",");
        }
      System.out.println();
        for(int j=A.length-1, i=0;i<A.length;i++,j--){
          B[j]=A[i];
        }
        for (int i : B) {
            System.out.print(i+",");
        }
    }
}
