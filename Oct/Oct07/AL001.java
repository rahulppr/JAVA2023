package Oct.Oct07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AL001 {
    public static void main(String[] args) {

        List<String> l = new ArrayList();

        l.add("Rahul");
        l.add("Singh");

        //To iterate the value
        Iterator iterator = l.iterator();
        while(iterator.hasNext()){
           // l.add("lucky");  ConcurrentModificationException occurs during the iteration of list.
            // We can't add anything to the list during Iteration, it will throw error.
            //But by using the CURSOR REFERENCE we can add it to the list without getting error.

            System.out.println(iterator.next());
        }

        for(String s:l){
            System.out.println(l);
        }

        //List Iterator -- for the old one but the concept remains same.
        //List Iterator is only valid for List like ArrayList,LinkedList,Stacks and Vector.
        //Whereas the Iterator is valid for all.

        ListIterator li = l.listIterator();
        while(li.hasNext()){
            //l.add("lucky"); //ConcurrentModificationException occurs during the iteration of listIterator.
            //We can't add anything to the list during Iteration, it will throw error.
            //In the listIterator, only the cursor reference can add the list Iterator.

            li.add("lucky");
            System.out.println(li.next());
        }

        System.out.println("-------------");

        while(li.hasPrevious()){
            System.out.println(li.previous());
        }


        //Difference
        //Iterator goes from left to right whereas listIterator goes from right to left or right to left.

    }
}

