public class Multplytdarrey 
{
  public static void main(String[] args) 
{
    int a[][]={{3,5,9},{7,6,2},{4,3,5}};
    int b[][]={{1,0,0},{0,1,0},{0,0,1}};
    int c[][]=new int[3][3];
            
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
            for(int k=0;k<c[0].length;k++){
                c[i][j]=c[i][j]+a[i][k]*b[k][j];
                
            }
            System.out.print(c[i][j]+",");
        }System.out.println();
        
    }
 }    

}