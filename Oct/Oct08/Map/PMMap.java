package Oct.Oct08.Map;

import java.util.HashMap;
import java.util.Map;

public class PMMap {
    public static void main(String[] args) {

        String msg = "Hii Rahul Singh, How are you Rahul bro??";

        Map<String,Integer> wordsMap = new HashMap();

        String[] words = msg.split(" ");

        for(String s:words){
            Integer count = wordsMap.get(s);
            if(count == null){
                wordsMap.put(s,1);
            }else{
                wordsMap.put(s,count+1);
            }
        }
        System.out.println(wordsMap);
    }
}


