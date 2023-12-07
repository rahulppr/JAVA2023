package Oct.Oct07.SetDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Set001 {
    public static void main(String[] args) {

        ArrayList l = new ArrayList();
        l.add("Rahul");
        l.add("Rahul");
        System.out.println(l);

        //Set --> It is an Interface and it has four classes.
        // Set does not gives the output of duplicate of element after giving multiple inputs.

        //1.EnumSet
        //2.HashSet
        //3.LinkedHash
        //4.TreeSet

        System.out.println("-----------------");

        Set s = new HashSet();
        s.add("Rahul");
        s.add("Rahul");
        System.out.println(s);


        System.out.println("--------------");


        Set se = new HashSet();
        se.add("Rakesh");
        se.add("RakesH");
        System.out.println(se);

        //List of Students who events to take part in Event
        //It contains duplicate, some students have done
        //Registration twice or thrice, How will remove the Duplicate
        //Set or List


    }
}

