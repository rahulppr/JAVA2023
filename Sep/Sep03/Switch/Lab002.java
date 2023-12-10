package Sep.Sep03.Switch;



import java.util.Locale;
import java.util.Scanner;

public class Lab002 {
    public static void main(String[] args) {
        //Vowel --> aeiou
        System.out.println("Enter Your Character");
        Scanner sc  = new Scanner(System.in);
        String c = sc.next();
        c = c.toLowerCase(Locale.ROOT);
        switch (c){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("It is Vowel");
                break;
            default:
                System.out.println("It is not a Vowel");
        }
    }
}

