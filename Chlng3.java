import javax.sound.sampled.SourceDataLine;

public class Chlng3 
{
public static void main(String[] args) {
     //String str="a!B@c#1$2%3";
    // System.out.println(str.replaceAll("\\W", ""));
    String str="      abc     def     gh   ijk    ";
   System.out.println(str= str.replaceAll("\\s+", " ").trim());
    String words[]=str.split("\\s");
    System.out.println(words.length);
     
    // String str="      abc     def     gh   ijk    ";
        
    // str=str.replaceAll("\\s+", " ").trim();
    
    // String words[]=str.split("\\s");
    
    // System.out.println(words.length);

}   
}
