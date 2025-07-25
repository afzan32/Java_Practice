class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Student: " + name + ", ID: " + id);
    }
}

class Department {
    String deptName;
    Student[] students;  // Aggregation: Department HAS-A Students

    Department(String deptName, Student[] students) {
        this.deptName = deptName;
        this.students = students;
    }

    void showDepartmentDetails() {
        System.out.println("Department: " + deptName);
        System.out.println("Students in department:");
        for (Student s : students) {
            s.display();
        }
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Student s1 = new Student("Afzan", 101);
        Student s2 = new Student("Nimal", 102);
        Student s3 = new Student("Kavya", 103);

        Student[] csStudents = {s1, s2, s3};

        Department csDept = new Department("Computer Science", csStudents);

        csDept.showDepartmentDetails();
    }
}
