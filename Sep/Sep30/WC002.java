package Sep.Sep30;

public class WC002 {

    public static void main(String[] args) {

        //Primitive to String
        int x = 123;
        //String  = x Not possible;
        //String s1 = (String)x; //Not possible
        //String s1 = x + "";//Not Recommended


        String s2 = String.valueOf(x); //This is the correct way
        String s3 = Integer.toString(x);

        double d  = 90.87;
        String sd1 = String.valueOf(d);
        String sd2 = Double.toString(d);

        //Primitive to String
        String sp = "123";
        int px = Integer.parseInt(sp);

        Integer pxwc = Integer.valueOf(px);




    }
}
