import java.util.*;

public class Array {

    public static void main(String[] args) {
        // Create an ArrayList of integers.

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(25);
        list.add(35);
        list.add(30);
        list.add(80);
        list.add(50);

        // Sort the ArrayList in ascending order.
        Collections.sort(list);

        // Print the sorted ArrayList.
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}