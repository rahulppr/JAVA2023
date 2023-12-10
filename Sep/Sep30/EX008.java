package Sep.Sep30;

public class EX008 {
    public static void main(String[] args) {

                try {
                    int a = 10 / 10;
                } catch (Exception a) {
                    System.out.println("I am Catch 01");
                } finally {
                    System.out.println("Finally 01");
                }

                try {
                    int a = 10 / 0;
                } catch (Exception a) {
                    System.out.println("I am Catch 02");
                } finally {
                    System.out.println("Finally 02");
                }


                try {
                    int a = 10 / 0;
                } catch (Exception a) {
                    System.out.println("I am Catch 03");
                    System.exit(-1); //Here the control gets terminated
                } finally {
                    System.out.println("Finally 03");
                }


    }
}
