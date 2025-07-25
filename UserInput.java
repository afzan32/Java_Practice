
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner objname =new Scanner(System.in);
        Scanner objage = new Scanner(System.in);
        System.out.println("What is your name");

        String name=objname.nextLine();
        int age = objage.nextInt();
        System.out.println("Your name is "+ name + age);
    }
}
