public class Student {

    private String name;
    private int roll_no;
    private int marks[] = new int[6];

    public Student(String name, int roll) {
        this.name = name;
        roll_no = roll;
    }

    public Student(String name, int roll, int[] marks) {
        this.name = name;
        roll_no = roll;
        setMarks(marks);
    }

    public String getName() {
        return name;
    }

    public int getrollNumber() {
        return roll_no;
    }

    public void getMarks() {
        for (int i = 0; i < 6; i++) {
            System.out.println("marks of sub " + (i + 1) + ":" + marks[i]);
        }
    }

    public void setMarks(int[] marks) {
        for (int i = 0; i < 6; i++) {
            this.marks[i] = marks[i];
        }
    }

    public double computeAvg() {
        int avg = 0;
        for (int i = 0; i < 6; i++) {
            avg += marks[i];
        }
        return (double) avg / 6;
    }

    public static void main(String[] args) {
        int m1[] = { 70, 80, 75, 85, 90, 83 };
        int m2[] = { 70, 83, 75, 85, 95, 83 };
        int m3[] = { 74, 80, 75, 85, 99, 83 };
        int m4[] = { 74, 84, 76, 85, 91, 83 };
        int m5[] = { 73, 82, 75, 88, 90, 83 };
        Student s1 = new Student("Student1", 001, m1);
        Student s2 = new Student("Student2", 002, m2);
        Student s3 = new Student("Student3", 003, m3);
        Student s4 = new Student("Student4", 004, m4);
        Student s5 = new Student("Student5", 005, m5);

        System.out.println(s1.computeAvg());
        System.out.println(s2.computeAvg());
        System.out.println(s3.computeAvg());
        System.out.println(s4.computeAvg());
        System.out.println(s5.computeAvg());

    }
}