package Sep.Sep03.forLoop;

public class Lab006 {
    public static void main(String[] args) {
        //go from 1 to 10
        //break if i=5
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
            if(i==5){
                System.out.println("Found 5");
                //break;
            }
        }
        System.out.println("Loop Ends");
    }
}

