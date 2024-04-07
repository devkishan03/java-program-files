public class MAXareynumber 
{
 static int max(int A[])
 {int m=A[0];
    for(int i=0;i<A.length;i++){
        if(A[i]>m)
        m=A[i];

    }
    return m;
  }
    
  
 public static void main(String[] args) {
    int A[]={1,12,13,15,32,23,21,45};
    System.out.println(max(A));
 } 
}
