public class THDArry 
{
    public static void main(String[] args) {
           //jegged array creat and store value
            int a[][];
            a=new int[3][];
            a[0]=new int[3];
            a[1]=new int[2];
            a[2]=new int[4];
            a[0][0]=1;  a[1][0]=5;  a[2][0]=9;
            a[0][1]=2;  a[1][1]=6;  a[2][1]=10;
            a[0][2]=3;              a[2][2]=11;
                                    a[2][3]=12;
        


                 //to creat store value
         //int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12,}};
                  
             
              //to creat and store valu other method 

              // int a[][]=new int[3][4];
        //   a[0][0]=1;  a[1][0]=5;  a[2][0]=9;
        //   a[0][1]=2;  a[1][1]=6;  a[2][1]=10;
        //   a[0][2]=3;  a[1][2]=7;  a[2][2]=11;
        //   a[0][3]=4;  a[1][3]=8;  a[2][3]=12;
          
              //to print

        for(int x[]:a){
            for(int y:x){
                System.out.print(" "+y);
            }System.out.println();
        }

                //other method to print

        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<a[0].length;j++){
        //         System.out.print(a[i][j]);
        //     }System.out.println(); 
        // }
    }
    
}
