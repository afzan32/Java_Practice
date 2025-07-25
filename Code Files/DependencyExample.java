class Book {  // Class B
    String title;  
    
    Book(String title) {
        this.title = title;
    }
    
    void read() {
        System.out.println("Reading book: " + title);
    }
}

class Student { //class A
    void borrowBook( Book book) {
        System.out.println("Student borrowed: " + book.title);
        book.read(); // Student depends on Book's read() method
    }
}

public class DependencyExample {
    public static void main(String[] args) {
        Book myBook = new Book("Java Programming");
        Student student = new Student();
        student.borrowBook(myBook); // Dependency: Student uses Book
    }
}

