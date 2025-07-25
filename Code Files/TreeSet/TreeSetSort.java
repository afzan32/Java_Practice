package TreeSet;

import java.util.TreeSet;

public class TreeSetSort {
    public static void main(String[] args) {
        // Create a TreeSet of strings
        TreeSet<String> fruits = new TreeSet<>();

        // Add elements in random order
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Orange");

        // TreeSet automatically sorts the elements
        System.out.println("Sorted fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
