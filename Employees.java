import java.io.*;
import java.util.*;

public class Employees implements Serializable, Cloneable {
    private String name;
    private int id;
    private int salary[];

    public Employees() {
    }

    public Employees(String ename, int eid, int esalary[]) {
        name = ename;
        id = eid;
        setSalary(esalary);
    }

    public Employees(Employees obj) {
        name = obj.name;
        id = obj.id;
        salary = obj.salary;
    }

    public Employees clone() {
        try {
            Employees cloneobj = (Employees) super.clone();
            cloneobj.salary = this.salary.clone();
            return cloneobj;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public boolean isEqual(Employees obj) {
        return this.equals(obj) && this.id == obj.id;
    }

    public String getName() {
        return name;

    }

    public int getId() {
        return id;
    }

    public int[] getSalary() {
        return salary;
    }

    public void setName(String ename) {
        name = ename;
    }

    public void setId(int eid) {
        id = eid;
    }

    public void setSalary(int esalary[]) {
        salary = new int[esalary.length];
        for (int i = 0; i < esalary.length; i++) {
            salary[i] = esalary[i];
        }
    }

    public static void main(String[] args) {
        String name;
        int id;
        int salary[];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Employees");
        n = sc.nextInt();
        sc.nextLine();
        Employees emp[] = new Employees[n];

        for (int i = 0; i < n; i++) {

            System.out.println("enter the name of an Employee " + (i + 1) + ":");
            name = sc.nextLine();
            System.out.println("enter the id of Employee:");
            id = sc.nextInt();
            System.out.println("enter the salary of 6 month");
            salary = new int[6];

            for (int j = 0; j < 6; j++) {
                System.out.println("Month " + (j + 1) + ":");
                salary[j] = sc.nextInt();
            }
            sc.nextLine(); // for agin taking next String type;
            emp[i] = new Employees(name, id, salary);
        }
        System.out.println(emp[0].isEqual(emp[1]));
        sc.close();
        try {

            FileOutputStream fo = new FileOutputStream("Employee.txt");
            ObjectOutputStream os = new ObjectOutputStream(fo);

            for (Employees e : emp) {
                os.writeObject(e);

            }
            os.close();
            fo.close();
            FileInputStream fis = new FileInputStream("Employee.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employees inemps[] = new Employees[n];

            for (int i = 0; i < inemps.length; i++) {
                inemps[i] = (Employees) ois.readObject();
            }
            for (Employees i : inemps) {
                System.out.println(i.getName());
            }
            ois.close();
            fis.close();
        } catch (Exception e) { // ioexception,class notfound exception;
            System.out.println(e);
        }

    }
}
