package Oct.Oct01;
import java.util.List;

public class CF003 {
    public static void main(String[] args) {
        //Collection
        //ArrayList

        List list = List.of("Apple","Orange","Sugar",123,"Rahul","Apple");
        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.size()); //List does not have length, it has size.
        System.out.println(list.indexOf(123));
        System.out.println(list.indexOf("Orange"));
        System.out.println(list.isEmpty());

        list.add("Ravi"); //Add is not allowed? Because Static immutable list

    }
}

