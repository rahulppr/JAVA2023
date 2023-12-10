package Sep.Sep03.Switch;


import java.util.Scanner;

public class Lab001 {
    public static void main(String[] args) {
        //Take a User Input 1-7
        //Day -1 --> Monday like etc.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Day");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
                break;
        }
    }
}
