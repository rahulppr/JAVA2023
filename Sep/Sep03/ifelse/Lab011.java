package Sep.Sep03.ifelse;

import java.util.Scanner;

public class Lab011 {
    public static void main(String[] args) {
        // Create according to User Input
        //Create a Program that determines whether a
        // given year is a leap year or not
        // A leap year is divisible by 4
        //but not by 100 unless it is divisible by 400
        //Use an if-else statement to make the determination.

        //((year % 4==0 && year % 100 !=0) || (year % 400 ==0))
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = sc.nextInt();
        if(((year % 4==0 && year % 100 !=0) || (year % 400 ==0))){
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}

