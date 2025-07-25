/*
 * File: StaticExample.java 
 * Lab:
 * Date: 24/03/2025 
 * Class Description: 
 * @author Sujanthika Morgan 
 */

class Employee {
   static String company; // Static variable
    static int employeeCount; // Static variable

    String name;  // Instance variable to store the name
    int age;      // Instance variable to store the age

    // Constructor to initialize instance variables
    Employee(String name, int age) {
        this.name = name;  // 'this' refers to the current instance
        this.age = age;    // 'this' refers to the current instance
    }

     // Method to display employee details
     void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    static void displayCompany() {
        System.out.println("Company: " + company);
    }

    static void incrementEmployeeCount() {
        employeeCount++;
    }

    static void addEmployee(String name) {
        // Local variable
        String employeeName = name;
        
        // Increment employee count
        employeeCount++;

        // Local variable for storing employee details
        String employeeDetails = "Employee: " + employeeName + ", Company: " + company;

        // Display employee details
        System.out.println(employeeDetails);
    }
}

public class StaticExample {
    public static void main(String[] args) {
        // Create instances of Employee
        Employee emp1 = new Employee("Alice", 30);
        Employee emp2 = new Employee("Bob", 25);

        // // Accessing instance variables through the objects
        emp1.displayDetails();
        emp2.displayDetails();
        Employee.displayCompany(); // Accessing static method

        // Modifying static variable
        Employee.company = "CodeSolutions";

        // Updating employee count
        Employee.incrementEmployeeCount();
       Employee.incrementEmployeeCount();

        Employee.addEmployee("John");

        // Display updated values
        System.out.println("Updated Company: " + Employee.company);
        System.out.println("Total Employees: " + Employee.employeeCount);


       
    }
}


