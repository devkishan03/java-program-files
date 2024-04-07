

public class Validate 
{
    static boolean validate(String name){
        return name.matches("[a-zA-Z\\s]+");
    }
    static boolean validate(int a){
        return a>=3&&a<=15;
    }
    public static void main(String[] args) {
        System.out.println(validate("kishan singh"));
        System.out.println(validate(14));

    }
}
