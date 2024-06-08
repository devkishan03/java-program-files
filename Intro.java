package Module_7.TwodArrays;

public class Intro {
    public static void main(String[] args) {
        int B[][]=new int[3][4];
       int A[][]={{1,2,3,4},{2,4,6,8},{3,5,7,9}}; 
      
     for(int i=0;i<A.length;i++){
        for(int j=0;j<A[i].length;j++){
            System.out.print(A[i][j]+",");
        }
        System.out.println();
      }     
        
      
        for (int x[] : A) {
            for (int y : x) {
                System.out.print(y+",");
            }
            System.out.println();
        }
    
    
    
    
    }
}
