package Oct.Oct08.Map;

import java.util.HashMap;
import java.util.Map;

public class Map02 {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap();
        map.put("name","Rahul");
        map.put("name","Rahul1"); //updated value is stored
        map.put("name1","Rahul");
        System.out.println(map);

    }
}
