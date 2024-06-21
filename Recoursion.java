package Module_8;

public class Recoursion {
    static void show(int i){
        if(i>0){
            show(i-1);
            System.out.println(i);
        }
    }
   
    
    static void show2(int i){
        if(i>0){
          System.out.println(i);
          show2(i-1);
       }
    }

   public static void main(String[] args) {
          show(10);
          show2(10);
   } 
}
