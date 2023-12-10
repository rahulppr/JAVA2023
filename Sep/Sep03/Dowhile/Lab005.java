package Sep.Sep03.Dowhile;

public class Lab005 {
    public static void main(String[] args) {
        int a = 10;
//        if(a==5){
//            break;
        //Break is directly not allowed in if loop.
        //  }

        for (int i=1;i<10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
    }
}