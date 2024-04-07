public class Nestedloop
 {
    public static void main(String[] args) 
    { 
        for(int i=1;i<=5;i++){
            
            for(int j=1;j<=5;j++){
              
                if(i+j>=6){
                System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            for(int k=1;k<=4;k++){
               if(k<i){
                System.out.print(" *");
               }else{
                System.out.print("  ");
               } 
            }System.out.println();
        }
        for(int i=1;i<=4;i++){

            for(int j=1;j<=5;j++){
                if(i<j){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            for(int k=1;k<=4;k++){
                if(k+i<5){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }
 }
    

