import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileReadWriteSimple {
    public static void main(String[] args) throws FileNotFoundException {
       // String inputFile = "input.txt";
       // String outputFile = "output.txt";

        //try {
            File inputFile = new File("input.txt");
            // Reading with Scanner
            Scanner scanner = new Scanner(inputFile);

            // Writing with PrintWriter
            PrintWriter writer = new PrintWriter("output.txt");

            // Read word by word or line by line — here line by line
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println("Read: " + line);
                writer.println("Processed: " + line);
            }

            // Close resources
            scanner.close();
            writer.close();

            System.out.println("Success! Output written");
//        } catch (FileNotFoundException e) {
//            System.err.println("File not found: " + e.getMessage());
//        }
    }
}

