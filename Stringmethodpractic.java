public class Stringmethodpractic 
{
    public static void main(String[] args) {
        String str="   welcome   ";
        // to chek length
        System.out.println(str.length());
        // to ckeck length with int type veriable storing
         int str1=str.length();
        System.out.println(str1);
        // for upper case
        String str2=str.toUpperCase();
        System.out.println(str2);
        // for lower case
        String str3=str.toLowerCase();
        System.out.println(str3);
        // for trim
        String str4=str.trim();
        System.out.println(str4);
        // substring begening
        String str5=str.substring(5);
        System.out.println(str5);
        // substring  begeing,ending
        String str6=str.substring(5, 8);
        System.out.println(str6);
        // to replace words
        String str7=str.replace('e', 'k');
        System.out.println(str7);
    }
    
}
