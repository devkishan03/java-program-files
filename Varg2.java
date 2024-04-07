public class Varg2 
{
   static void showList(int index,String ...s){
    for(int i=0;i<s.length;i++){
        System.out.println(index+"."+s[i]);
        ++index;
    }
   }   
   public static void main(String[] args) 
   
   {

    showList(1,"hi","hello","by","thankyou","good");
   }
}
