public class Strngmethodpractice3 
{
    public static void main(String[] args) 
    {
        String str1="JAVA";
        String str2="java";
        String str3="python";
        String str4="python";
        String str5=new String("java");
        // to check equal method
        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str4));
        System.out.println(str1.equals(str4));
        System.out.println(str5.equals(str2));
        System.out.println(str5==str2);
        System.out.println(str1.equals(str5));
        // to check equals but bypass casesensetive (equalsignorecase).
        System.out.println(str1.equalsIgnoreCase(str2));
        // to compare

        System.out.println(str2.compareTo(str4));
        System.out.println(str1.compareTo(str1));
        System.out.println(str1.compareTo(str2));
        System.out.println(str3.compareTo(str2));
        // compare but bypass casesensetive (compareignorecase).
        System.out.println(str1.compareToIgnoreCase(str2));
        
    }
    
}
