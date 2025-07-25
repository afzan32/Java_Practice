
import java.util.HashSet;

public class Hashset_my {
    public static void main(String[] args) {
        HashSet <String> my= new HashSet<>();
        my.add("Afzan");
        my.add("Afza");

        for(String m:my){
            System.out.println(m.hashCode());

        }
        
        
    }
}
