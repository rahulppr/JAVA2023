package Oct.Oct07.SetDemo;

import java.util.HashSet;
import java.util.Set;

public class Set003 {
    public static void main(String[] args) {

        Set hs = new HashSet();

        //ArrayList -- Dynamic Array
        //LinkedList -> Doubly Linked List
        //Vector --> Dynamic Array but Thread Safe
        //Stack --> LIFO(Expand)

        //HashSet - mean? How they are storing the values in HashSet
        //HashTable --It does not take care the order

        HashSet hs2 = new HashSet();
        hs2.add("Rahul");
        hs2.add(23);
        hs2.add(109);
        hs2.add("Singh");
        System.out.println(hs2);

        System.out.println(hs2.size());
        hs2.remove(23);
        System.out.println(hs2);
        hs2.clear();
        System.out.println(hs2);



    }
}

