package Module_7;

public class Copyelements {
    public static void main(String[] args) {
        int A[]={2,4,6,7,9,3,4,5,6,7,9};
        int B[]=new int[A.length];
        for (int i : A) {
            System.out.print(i+",");
        }
         System.out.println();
        for(int i=0;i<A.length;i++){
            B[i]=A[i];
        }
        
          for (int i : B) {
            System.out.print(i+",");
        }

    }
}
