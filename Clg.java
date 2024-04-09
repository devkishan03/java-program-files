package Practice;

class Subject
{ 
    private String subId;
    private String sName;
    private int maxmarks;
    private int marksobtain;

    public String getsubId(){
        return subId;
    }
    public String getsName(){
        return sName;
    }
    public int getmaxmarks(){
        return maxmarks;
    }
    public int getmarksobtain(){
        return marksobtain;
    }
    public void setmarksobtain(int marksobtain){
        this.marksobtain=marksobtain;
    }
    public Subject(String subId,String sName){
        this.subId=subId;
        this.sName=sName;
    }
    public Subject(String subId,String sName,int maxmarks){
        this.subId=subId;
        this.sName=sName;
        this.maxmarks=maxmarks;
    }
    public Subject(String subId,String sName,int maxmarks,int marksobtain){
        this.subId=subId;
        this.sName=sName;
        this.maxmarks=maxmarks;
        this.marksobtain=marksobtain;
    }
    public String toString(){
        return("subId="+subId+"\n"+"sName= "+sName+"\n"+"maxmarks= "+maxmarks+"\n"+"marksobtain= "+marksobtain);
    }
    public boolean isqualified(){
        return marksobtain>(maxmarks*40)/100;
    }
}
class Student
{
    private String rollno;
    private String name;
    private String department;
    private Subject [] subjects;

    public String getrollno(){
        return rollno;
    }
    public String getname(){
        return name;
    }
    public String getdepartment(){
        return department;
    }
    public Subject [] getsubjects(){
         return subjects;
    }
         
    public void setsubjects(Subject...s){
           subjects=new Subject[s.length];
           for(int i=0;i<=s.length;i++){
                subjects[i]=s[i];
           }
    }
    public Student(String rollno,String name){
          this.rollno=rollno;
          this.name=name;
          subjects=new Subject[0];
    }
    public Student(String rollno,String name,String department,Subject [] subject){
          this.rollno=rollno;
          this.name=name;
          this.department=department;
          setsubjects(subject);
    }
    public Student(String rollno,String name,String department){
        this.rollno=rollno;
        this.name=name;
        this.department=department;
    }
    public String toString(){
       return ("rollno is= "+rollno+"\n"+"name= "+name+"\n"+
       "department= "+department+"\n"+"subjects= "+subjects);
    }


}

public class Clg {

    public static void main(String[] args) {
        Subject sub[]=new Subject[3];
        sub[0]=new Subject("001", "java", 100,70);
        sub[1]=new Subject("002","python",100,78);
        sub[2]=new Subject("003", "javascript",100,100);
          
        for(Subject s:sub){
                System.out.println(s+"\n");
           }

          // System.out.println(sub[1].isqualified());
          
           Student s=new Student("123", "kishan", "java",sub);
              System.out.println(s);
              
              
    }


    
}
