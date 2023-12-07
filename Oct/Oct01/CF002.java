package Oct.Oct01;

import java.util.Vector;

public class CF002 {
    public static void main(String[] args) {

        int[] a = new int[10];
        //Limitations
        //Fixed Size;
        //Insert and Delete --> Heavy Operation
        //Store only one type of element -- Similar Integer

        a[0] = 10;
       // a[1] = "Rahul"; we cannot store different type of element

        //Vector - It is a legacy class (1.2)
        //Java 8 - It is re-written this class

        Vector v = new Vector(10);

        //capacity is default no need to declare the size

        v.add(1);
        v.add("Rahul");
        v.add("Java");

        System.out.println(v);
        //Vector--Initial Capacity
        //when we add the 9th element then it capacity increases from 9th to 20th automatically (Internally).
        //if we want to set some value st some location then
        v.set(0,"Singh");
        System.out.println(v);

        v.remove(0);

        System.out.println(v);

    }
}

