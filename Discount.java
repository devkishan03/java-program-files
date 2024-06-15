package Module_8;

public class Discount {

    static double discount(double ...price){
          double total=0;
          for(int i=0;i<price.length;i++){
            total=total+price[i];
          }
          if(total>500 && total<1000){
            return total*10/100;
          }else if(total>1000){
            return total*20/100;

          }
          return total=0;
    }


    public static void main(String[] args) {
        System.out.println("your discount will be:"+discount(100,200,800,200));
    }
}
