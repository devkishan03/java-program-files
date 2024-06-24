package Module_8;

public class Variableargus {
    
    static int max(int...n){
          int a=n[0];
          for(int i=0;i<n.length;i++){
            if(n[i]>a){
                a=n[i];
            }
          }
          return a;
    }
     
    
    static void names(int a,String...s){
         
          for(int i=0;i<s.length;i++){
           System.out.println(a+"."+s[i]);
           a++;
          }
         
    }
    
    
    public static void main(String[] args) {
        
        System.out.println(max(10,1,2,3,4,5,6,6,7,80,0,90));
     
        names(1,"kishan","kundan","hi","hello");
      
    
    }
}
