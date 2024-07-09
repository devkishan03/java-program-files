package Module_9_Oops.Singletonclass;


import java.time.LocalDate;

class Student
{
    private String rollno;

    private static int count=1;

    String str=""+LocalDate.now().getYear();

    

    public Student(){
        rollno="UNV-"+str+"-"+count;
        count++;
    }

    public String getRollno(){
        return rollno;
    }

}
public class Schalang {
    public static void main(String[] args) {
        Student s=new Student();
        Student s2=new Student();
        System.out.println(s.getRollno());
        System.out.println(s2.getRollno());
    }
}
