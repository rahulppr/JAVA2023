package Oct.Oct07.SetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set004 {
    public static void main(String[] args) {

        Set courseSets = new HashSet(); //Dynamic Dispatch
        //A father Interface can have reference to child class Object.
        courseSets.add("ATB");
        courseSets.add("MTB");
        courseSets.add("LAPIT");
        courseSets.add("SDET Blueprint");
        courseSets.add("Java for Testers");

        //System.out.println(courseSets);

        //Enhanced for loop
        for(Object o:courseSets){
            System.out.println(o);
        }

        //By using Iterator
        Iterator i = courseSets.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }



    }
}
