package Sep.Sep30;


public class EX001 {
    public static void main(String[] args) {
        // File a = new File("C:/dog.txt");
       //  FileInputStream a2 = new FileInputStream(a);

        String name = null;
        String name1 = "Rahul";

        try{
            //name.trim();
           // int a = 10/0;
            Integer.parseInt("name1");
            //Some code which will give Arithematic Exception
        }
            catch( Exception e){ //we may have ...Throwable,Exception or Error
                System.out.println("Can't to trim for null reference ");
        }
        System.out.println("This line I want to execute");

    }
}

