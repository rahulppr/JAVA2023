package Sep.Sep03.ifelse;



public class Lab008 {
    public static void main(String[] args) {
        int a = 10;
        int b =20;
        int c = 30;
        int max = 0;

        if(a>b && a>c){
            max = a;
        } else if (b>c && b>a) {
            max = b;
        } else {
            max = c;
        }
        System.out.println( "The max value is " +max);
    }
}

