package Oct.Oct08.Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable01 {
    public static void main(String[] args) {

        Hashtable<Integer,String> ht1 = new Hashtable<>();
        ht1.put(1,"one");
        ht1.put(2,"two");
        ht1.put(3,"three");


        Enumeration<Integer> e = ht1.keys();
        while(e.hasMoreElements()){

            //Getting the key of a Particular elements
            int key = e.nextElement();

            //Print and display the Rank and Name
            System.out.println("Rank :" +key
            +"\t\t Name : "
            + ht1.get(key));
        }
    }
}

//HasTable and vector supports Enumeration

