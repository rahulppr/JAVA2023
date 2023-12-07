package Oct.Oct08.Map;
import java.util.*;

public class Map06 {
    public static void main(String[] args) {

        //Map m = new TreeMap();
        Map m = new HashMap();
        //Map m = new LinkedHashMap();

        m.put("name","Rahul");
        m.put(null,234);
        m.put("age","28");

        System.out.println(m);

        System.out.println("---------------------");

//      HashTable
        //Synchronised and Thread Safe
        Hashtable<Integer,String> ht = new Hashtable();
        ht.put(1,"Rahul");
        ht.put(2,"ahul");
        ht.put(3,"hul");
        ht.put(null,"pipe");//Key cannot be null, throws NullPointerException

        System.out.println(ht);
    }
}


