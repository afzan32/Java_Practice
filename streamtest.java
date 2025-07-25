
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class streamtest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();   // create an collection
        names.add("Afzan");
        names.add("Fayas");

        for(String name:names){ // using for loop for printing 
            // if(name.startsWith("A")){
                System.out.println(name);
            // }
           
        }
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println); // using streams for printing 
    
        int[] numbers= {1,4,2,3};
       // IntStream  numstrm     =Arrays.stream(numbers);
        Arrays.stream(numbers).forEach(System.out::println);
    }
}
