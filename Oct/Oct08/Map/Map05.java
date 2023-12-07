package Oct.Oct08.Map;

import java.util.HashMap;

public class Map05 {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap();
        map.put(1,"Mango");
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(1,"Grapes");

        System.out.println(map);

         map.remove(10);
         map.putIfAbsent(10,"Coconut");
        System.out.println(map);

         map.remove(10,"Coconut");
        System.out.println(map);
    }
}

