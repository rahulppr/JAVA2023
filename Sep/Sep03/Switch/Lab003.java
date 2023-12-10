package Sep.Sep03.Switch;


import java.util.Scanner;

public class Lab003 {
    public static void main(String[] args) {

        System.out.println("Enter the browser name");
        Scanner sc = new Scanner(System.in);
        String browser = sc.next();

        switch(browser){
            case "chrome":
                System.out.println("Code to start the chrome");
                break;
            case "mozilla":
                System.out.println("code to start the firefox");
                break;
            case "opera":
                System.out.println("code to start the opera");
                break;
            default:
                System.out.println("Invalid Browser");
        }
    }
}

