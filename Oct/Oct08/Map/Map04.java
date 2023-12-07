package Oct.Oct08.Map;

import java.util.HashMap;
import java.util.Map;

public class Map04 {
    public static void main(String[] args) {

        Map<String,Integer>  map = new HashMap();
        map.put("a",100);
        map.put("b",200);
        map.put("c",300);
        map.put("d",400);
        map.put("e",500);
        System.out.println(map);

        //Traversing through Map using for-each loop
        for (Map.Entry<String,Integer> m : map.entrySet()){

            //Printing Keys
            System.out.println(m.getKey() + ":");
            System.out.println(m.getValue());
        }
    }
}

