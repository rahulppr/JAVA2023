package Sep.Sep03.ifelse;


import java.util.Scanner;

public class Lab010 {
    public static void main(String[] args) {

        //Grade Calculator

        //Write a program that calculates and displays the letter grade for a numerical score
        //(e.g. A,B,C,D or F) based on the following grading scale.
        // A:90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F:0-59

        //Take Input from the user grade
        //grade >90 and grade < 100 sout--> A
        //grade> 80 and grade < 89 sout-->B

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Score");
        int score = sc.nextInt();
        char grade = 0;
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("The grade is " + grade );
    }
}

