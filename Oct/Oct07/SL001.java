package Oct.Oct07;
import java.util.ArrayList;
import java.util.Spliterator;

public class SL001 {
    public static void main(String[] args) {
        //Split iterator //Optional

        ArrayList<Integer> al = new ArrayList();
        //Add values to the ArrayList
        al.add(1);
        al.add(2);
        al.add(-3);
        al.add(-4);
        al.add(5);

        //getting splitIterator object on al
        Spliterator<Integer> splitr1 = al.spliterator();

        //estimatesize method
        System.out.println("estimate size:" + splitr1.estimateSize());

        //getExactsizeIfknown method
        System.out.println("exact size :" + splitr1.getExactSizeIfKnown());

        //getting SplitIterator object on al
        Spliterator<Integer> splitr2 = al.spliterator();

        Spliterator<Integer> splitr1_split = splitr1.trySplit();

        if(splitr1_split != null ){
            System.out.println("Output from splitr2: ");
            splitr1_split.forEachRemaining((n) -> System.out.println(n));
        }

        System.out.println("\nOutput from splitr1: ");
        splitr2.forEachRemaining((n) -> System.out.println(n));

    }
}

//Need to check the code from Pramod's Github