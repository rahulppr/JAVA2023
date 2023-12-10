package Sep.Sep09.Arrays;


import java.util.Scanner;

public class Array07 {
    public static void main(String[] args) {
        //Take Input from the user
        //90,91,45,89,93
        //Max-->93

        System.out.println("Enter Subjects Count");
        Scanner sc = new Scanner(System.in);
        int total_subjects = sc.nextInt();

        int[] marks = new int[total_subjects];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter your marks one by one");
            marks[i] = sc.nextInt();
        }

        System.out.println("Here is your marks");

        for (int i = 0; i < marks.length ; i++) {
            System.out.println("Here is your marks of subject--> " +marks[i]);
        }

        //for max condition
        int max = marks[0];
        for (int i = 0; i < marks.length ; i++) {
            if(marks[i]>max){
                max = marks[i];
            }
        }
        System.out.println("The max marks from " +marks.length+ " subjects is " +max);
    }
}

