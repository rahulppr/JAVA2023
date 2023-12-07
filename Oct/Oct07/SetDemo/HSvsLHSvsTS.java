package Oct.Oct07.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HSvsLHSvsTS {
    public static void main(String[] args) {

        Set<Integer> integerSet = new HashSet(); //order not matter
        integerSet.add(123456);
        integerSet.add(12345);
        integerSet.add(1234);
        integerSet.add(123);
        integerSet.add(12);
        integerSet.add(null);
        System.out.println(integerSet);

        Set<Integer> integerSet2 = new LinkedHashSet(); //order matters,duplicates not allowed
        integerSet2.add(123456);
        integerSet2.add(12345);
        integerSet2.add(1234);
        integerSet2.add(123);
        integerSet2.add(12);
        integerSet2.add(null);
        integerSet2.add(null);
        System.out.println(integerSet2);

        //Sorting will happen and not happen during multiple data type.
        Set<Integer> integerSet3 = new TreeSet();
        integerSet3.add(123456);
        integerSet3.add(12345);
        integerSet3.add(1234);
        integerSet3.add(123);
        integerSet3.add(12);
        //integerSet3.add(null); //Not possible

        System.out.println(integerSet3);

        //List of elements in Page
        //We store without any order--> HashSet there is no duplicate.
        //Maintain Order --> LinkedHashSet
        //Sort them by Alphabet--> TreeSet

        //We need duplicate also
        //ArrayList
    }
}

