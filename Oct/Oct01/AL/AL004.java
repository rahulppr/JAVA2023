package Oct.Oct01.AL;

import java.util.ArrayList;
import java.util.Iterator;

public class AL004 {
    public static void main(String[] args) {

        //<String>
        ArrayList stringList = new ArrayList();
        stringList.add("Rahul");
        stringList.add("Singh");
        //stringList.add(123);

        System.out.println(stringList);

        //If we know the data type then we use string otherwise use Object instead of String
        //Enhanced for loop
//        for(Object s:stringList){ //Iterate using foreach loop
//            System.out.println(s);
//        }

        System.out.println("---------------------------------");

        //Iterate over the List
        //Using the Iterator Interface

        Iterator iterator = stringList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

