package Sep.Sep30;

public class EX007 {
    public static void main(String[] args) {

        try{
            int a = 0; // 1
//            int a = 10;
            int x = 10/a;
        }catch (Exception e){
            System.out.println("Exit");
            //System.exit(0); //This is the only case when finally will not be called and control gets terminated.
        }finally {
            // Write the code which you want 100% to be executed!
            // database close
            // webdrive close. file close and IO clode, scanner close
            System.out.println("I am final");
        }
    }
}
