package Oct.Oct01.AL;

import java.util.Enumeration;
import java.util.Vector;

public class Vector001 {
    public static void main(String[] args) {

        Vector<String> vector = new Vector();

        //Adding the elements
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");

        //Before iterator we are using the Enumeration for the old class or Enum class
        //Enumeration is only allowed for the vector class
        // or legacy classes like Stack,Hashtable,Properties and Dictionary. not for the List class

        Enumeration e = vector.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
