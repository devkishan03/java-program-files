package Module_8;

public class Passingobj {
   
    static void update(int a[],int index,int value){
        a[index]=value;
    }

    static String username(String email){
       return email.substring(0,email.indexOf("@"));
    }

    static int update2(int a,int value){
       return a=value;
    }
    
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        String mail="Kishan@gmail.com";

        update(a,2,8);
       for (int i : a) {
        System.out.println(i+" ");
       }
       
        System.out.println(username(mail));

        int x=10;
        
         update2(x,15);
        System.out.println(x);  //here premitive data types value not modified



    }
}
