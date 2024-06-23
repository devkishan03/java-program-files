package Module_8;

public class Validate {
    static boolean validate(String name){
        return name.matches("[a-zA-Z\\s]+");
    }
    static boolean validate(int age){
       return 3<age && age<14 ? true:false;
    }
    public static void main(String[] args) {
        System.out.println(validate("kishan singh"));
        System.out.println(validate(15));
    }
}
