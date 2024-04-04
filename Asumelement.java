//import java.util.*;
public class Asumelement 
{
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
       // System.out.println("enter the key");
        //int k=sc.nextInt();
         int A[]={3,9,7,8,17,6,16,5,4,10};
        int max=A[0],max2=A[0];
         for(int i=0;i<=A.length-1;i++){
                   if(max<A[i]){
                    max2=max;
                    max=A[i];
                   }else if(max2<A[i]){
                    max2=A[i];
                   }
                  
            }System.out.println("maximum number is = "+max);
            System.out.println("2nd maximum number is = "+max2);
            
              
                
    
         
        
        
        
        
        
        
        
        
        // int sum=0;
        // for(int i=0;i<=A.length-1;i++)
        // {
        // sum=sum+A[i];
        // }System.out.println("the sum is = "+sum);
    }
}   

