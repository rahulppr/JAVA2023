package Oct.Oct08.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue03 {
    public static void main(String[] args) {

        //Queue<String> stringqueue = new PriorityQueue<String>();

//        stringqueue.add("banana");
//        stringqueue.add("apple");
//        stringqueue.add("cat");

//        System.out.println(stringqueue);

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(41);
        pq.add(32);
        pq.add(52);
        System.out.println(pq);
    }
}
