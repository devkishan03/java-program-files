package Practice;
class student1
{
 public String name;
 public long rollno;
 public String course;
 public int m1,m2,m3;
 

 public int toltal(){
    return m1+m2+m3;
 }
 public float avg(){
    return (float)toltal()/3;
 }
 public char grade()
 {
   if(avg()>=80)
   return 'A';
   else
   return 'B';
  }
  public String toString(){
    return "name : "+name+"\n"+"roll no : "+rollno+"\n"+"course : "+course;
  }
}

public class StudentTest {
  public static void main(String[] args) {
    student1 s=new student1();
    student1 s1=new student1();
    s.name="kishan";
    s.rollno=236016200;
    s.course="science";
    s.m1=70;
    s.m2=75;
    s.m3=78;

    s1.name="kishan singh";
    s1.rollno=236016200;
    s1.course="science";
    s1.m1=78;
    s1.m2=79;
    s1.m3=81;

    System.out.println("student daitels= "+"\n" + s);
    System.out.println("total marks= "+s.toltal());
    System.out.println("avg marks="+s.avg());
    System.out.println("grade="+s.grade());

    System.out.println(); 

    System.out.println("student daitels= "+"\n" + s1 );
    System.out.println("total marks= "+s1.toltal());
    System.out.println("avg marks="+s1.avg());
    System.out.println("grade="+s1.grade());
  }  
}
