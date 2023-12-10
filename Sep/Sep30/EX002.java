package Sep.Sep30;

public class EX002 {
    public static void main(String[] args) {

        try{
            String s1  = args[0];
            int y = Integer.parseInt(s1);
            int x = 10/y;
            System.out.println(x);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
