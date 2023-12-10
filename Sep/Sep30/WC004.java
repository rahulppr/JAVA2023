package Sep.Sep30;

public class WC004 {
    public static void main(String[] args) {

        Character ch = 'a';
        //Unboxing the character object to primitive
        char a = ch;

       // System.out.println(Integer.max(25,89));

        Integer values = 10;
        Integer values2 = 10;
        System.out.println(values==values2);

        //values++;
        //System.out.println(values);
        System.out.println(values==values2);

        int x=10;
        int y=10;
        //System.out.println(x==y);

        String s1 = "Rahul";//String Pool
        String s2 = "Rahul";//String Pool
        String s3 = new String("Rahul");//Heap Area

        //System.out.println(s1==s2);
        //System.out.println(s1==s3);


    }
}
