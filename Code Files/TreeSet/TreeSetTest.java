package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args){
        var parts=new TreeSet<Item>();
        parts.add(new Item("Toaster",1234));
        parts.add(new Item("Widget",5432));
        parts.add(new Item("Modem",9980));
        System.out.println(parts);

        var sortByDescription=new TreeSet<Item>(
                Comparator.comparing(Item::getDescription)
        );
        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
    }
}
