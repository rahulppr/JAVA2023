package Oct.Oct07.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set005 {
    public static void main(String[] args) {

        Set hs = new HashSet();
        Set lhs = new LinkedHashSet(); //LinkedHashSet maintain the Order.
        //Doubly Linked List
        hs.add(null);
        //System.out.println(hs);

        //How HashSet stores the Table? ---> By using the HashTable, it has No order.
        lhs.add("Rahul");
        lhs.add("Singh");
        lhs.add("Lucky");
        lhs.add(null);
        //System.out.println(lhs);

        Set treeset = new TreeSet();
        treeset.add("Rahul");

       // treeset.add(null); null cannot be added in the case of treeset.
        //By default,TreeSet follows alphabetical order to store the data.i.e
        // sorting matter but order does not matter.

        System.out.println(treeset);
        //Tree set??
        treeset.add("ahul");
        treeset.add("zebra");
        treeset.add("amul");
        System.out.println(treeset);

    }
}

