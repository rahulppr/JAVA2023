package Oct.Oct08.Queue;

import Oct.Oct08.Queue.ATBStudent;

import java.util.PriorityQueue;

public class Queue02 {
    public static void main(String[] args) {

        ATBStudent s1 = new ATBStudent(1,"Rahul","ATB");
        ATBStudent s2 = new ATBStudent(2,"Vivek","ATB");

        PriorityQueue<ATBStudent> pq = new PriorityQueue();
        pq.add(s1);
        pq.add(s2);

        System.out.println(pq);
    }
}

