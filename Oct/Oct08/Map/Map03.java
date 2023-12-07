package Oct.Oct08.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map03 {
    public static void main(String[] args) {

        Map<Integer,String> studentmap = new HashMap();
        studentmap.put(1,"Rahul");
        studentmap.put(2,"Ajit");
        studentmap.put(4,"Vikram");
        studentmap.put(3,"Ranjan");
        studentmap.put(7,"ahul");
        studentmap.put(5,"hul");
        studentmap.put(null,"Atta");
        studentmap.put(-1,"Riki");

        //get
       // System.out.println(studentmap);

        //System.out.println(studentmap.get(2));
       // System.out.println(studentmap.get(5));

        //To get all the values
        //EntrySet()

        //Only the map has the entry method not in the set or any other case

        Set a = studentmap.entrySet();
        System.out.println(a);

        System.out.println("----------------");

        for(Map.Entry<Integer,String> e: studentmap.entrySet()){
            System.out.println(e.getKey()+" ---> " + e.getValue());
        }

    }
}

