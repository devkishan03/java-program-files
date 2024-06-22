package Module_8;

public class Sumofallnumbers {
   static int sum(int ...n){
    int total=0;
    for(int i=0;i<n.length;i++){
        total=total+n[i];
    }
    return total;
   }



    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,7,7,8,8,9,9,68));
    }
}
