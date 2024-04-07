public class DiscountVa 
{
 static void dicount(int ...a){
   int total=0;
   int n=0;
    for(int x:a){
        total=total+x;
    }
    
    if(total<500)
       n=10;
      if(total>500&total<1000)
       n=20;
      if(total>1000)
      n=30;
      int m=total*n/100;
      int price=total-m;
      System.out.println("total bill= "+total);
      System.out.println("your discount will be "+n+" % = "+m);
      System.out.println("total price is = "+price);
    
 } 
 public static void main(String[] args) {
    dicount(100,200,300,600,800);
 }  
}
