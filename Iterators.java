
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(29);

        Iterator <Integer> it = numbers.iterator();

        while(it.hasNext()){
            Integer name = it.next();
            System.out.println(name);
        }

        

    }
}
