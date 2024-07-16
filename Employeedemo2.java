package Assignment2;

import java.util.*;

// Base class Employee
class Employee {
    private String name;
    private int age;
    private Manager manager; // Reference to the manager

    // Constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for manager
    public void setManager(Manager manager) {
        this.manager = manager;
    }

    // Getter for manager
    public Manager getManager() {
        return manager;
    }

    // Method to print employee details
    public String toString() {
        return "Employee Name: " + name + "\n" + "   Age: " + age + "\n";

    }
}

// Subclass Manager
class Manager extends Employee {
    private ArrayList<Employee> employees; // List of employees managed by the manager

    // Constructor
    public Manager(String name, int age) {
        super(name, age);
        employees = new ArrayList<>();
    }

    // Method to add an employee to the list
    public void addEmployee(Employee employee) {
        employees.add(employee);
        employee.setManager(this); // Set this manager as the employee's manager
    }

    // Method to print manager details, including employees managed
    @Override
    public String toString() {
        String str = "Manager Name: " + getName() + "\n" + "Age: " + getAge() + "\n" + "Employees Managed:" + "\n";
        for (Employee e : employees) {
            str += " - " + e.toString();
        }
        return str;
    }

}

// Test the implementation
public class Employeedemo2 {
    public static void main(String[] args) {
        // Create employees
        Employee emp1 = new Employee("Alice", 30);
        Employee emp2 = new Employee("Bob", 25);

        // Create a manager
        Manager mgr = new Manager("Charlie", 40);

        // Assign employees to the manager
        mgr.addEmployee(emp1);
        mgr.addEmployee(emp2);

        // Print details of the manager and employees

        // System.out.println(emp1);
        System.out.println(mgr);
    }
}