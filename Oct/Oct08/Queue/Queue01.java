package Oct.Oct08.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {

        //Queue follows the rule of FIFO.

        Queue <Integer> integerqueue = new PriorityQueue();


        //Here allow to insert or add multiple data type otherwise it will give ClassCastException.
        //Arranged in order of Processing
        integerqueue.add(100);
        integerqueue.add(20);
        integerqueue.add(50);

        System.out.println(integerqueue);
        integerqueue.poll();
        System.out.println(integerqueue);
         integerqueue.add(68);
       // pq.add(null); //NullPointerException
        System.out.println(integerqueue);
       // System.out.println(" Peek part "+integerqueue.peek());


        //Iterating the element by using the Iterator

//        Iterator iterator = integerqueue.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next() + " ");
//        }

    }
}


