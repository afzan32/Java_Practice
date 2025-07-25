import java.io.FileWriter;

public class File {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Sample");
            fw.write("TPR TUTOR");
            fw.write("afzan");
            fw.append("hello");
            fw.close();
            System.out.println("Succesfully text added");
        } catch (Exception e) {
            System.out.println("exception found");
            
        }

    }
}
