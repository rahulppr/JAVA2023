package Oct.Oct01.AL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AL001 {
    public static void main(String[] args) {

        List list  = List.of("A","B"); //Immutable List -- Constant List

        ArrayList list1 = new ArrayList();
        //Mutable and Dynamic Size

        List list2 = new ArrayList();
        //Dynamic Dispatch
        //Father can have reference to child class

        list1.add("Rahul");
        list1.add("System");
        list1.add("Apple");
        list1.add("Singh");
       // list1.add(123);

        //list1.add(null);
        System.out.println(list1);

        System.out.println(list1.size());

        System.out.println(list1.isEmpty());

       // list1.remove(1);

        //Sort
        Collections.sort(list1);
        System.out.println(list1);

    }
}

