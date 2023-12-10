package Sep.Sep30;

public class Ex005 {
    public static void main(String[] args) {

        try{
            String s1 = null;
            s1.trim();

            //Open a file

        } catch(Exception e){
            //e.printStackTrace();
            //System.out.println("Custom Message");
            System.out.println(e.getMessage());
        }
        finally{
            //Some codes to be executed 100%
            System.out.println("I am done with finally");

            //driver.close();
            //db.close();
            //fileIn.close();

        }

    }
}
