import java.util.*;

public class RemoveDuplicateAndSortLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(1);
        ll.add(3);
        ll.add(1);

        System.out.println("Elements from Linkedlist: " +ll);

        LinkedHashSet<Integer> hashset = new LinkedHashSet<Integer>(ll);
        System.out.println("Elements after sorted and removed duplicates: " + hashset);
    }
}
