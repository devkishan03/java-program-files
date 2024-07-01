package Module_9_Oops.Arrayofobj;

class Subject{
    private String subname;
    private String subid;
    private int maxmarks;
    private int marksobtain;

    public Subject(String subname,String subid){
        this.subid=subid;
        this.subname=subname;
    }
    public Subject(String subname,String subid,int maxmarks){
        this.subid=subid;
        this.subname=subname;
        this.maxmarks=maxmarks;
       
    }

    public void setmarkobtain(int marksobtain){
         this.marksobtain=marksobtain;
    }
    public String getsubname(){
        return subname;
    }
    public String getsubid(){
        return subid;
    }
    public int getmaxmarks(){
        return maxmarks;
    }
    public int getmaxmarksobtain(){
        return marksobtain;
    }
    public String toString(){
        return "subname:"+subname+"\n"+"subid:"+subid+"\n"+"maximum marks:"+maxmarks+"\n"+"marksobtain:"+marksobtain+"\n";
    }
    public boolean isqualified(){
        return marksobtain>maxmarks*4/10;
    }
    
}

class Student{
  
    private String name;
    private String rollno;
    private String dept;
    private Subject []subjects;

    public Student(String name,String rollno){
        this.name=name;
        this.rollno=rollno;
    }
    public Student(String name,String rollno,String dept,Subject ...subjects){
        this.name=name;
        this.rollno=rollno;
        this.dept=dept;
        this.subjects=subjects;
    }

    public String getName(){
        return name;
    }
    public String getRollno(){
        return rollno;
    }
    public String getDept(){
        return dept;
    }
     public Subject[] getSubjects(){
       return subjects;
    }

    public String toString(){
        return "student name:"+name+"\n"+"student rollno:"+rollno+
        "\n"+"Deparment:"+dept+"\n"+"subjects:"+subjects;
    }

    public void setSubjects(Subject...subjects){
        this.subjects=subjects;
    }
    public void setDept(String dept){
        this.dept=dept;
    }
}
public class School {
    public static void main(String[] args) {
        Subject sub[]=new Subject[3];
          sub[0]=new Subject("java","001",100);
          sub[1]=new Subject("pythone","002",100);
          sub[2]=new Subject("os", "003", 100);
         
            for (Subject s : sub) {
                 System.out.println(s);
            }
           
         Student s=new Student("kishan", "23601620023", "EE", sub[0],sub[1],sub[2]);
          s.setSubjects(sub[0],sub[1]);
         System.out.println(s.getSubjects());
            
         
       
       
   }
}

