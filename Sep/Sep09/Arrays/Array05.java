package Sep.Sep09.Arrays;


import java.util.Scanner;

public class Array05 {
    public static void main(String[] args) {
        System.out.println("How many elements you want to store?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] user_array = new int[n];
        for (int i = 0; i < user_array.length; i++) {
            System.out.println(user_array[i]);
        }
    }
}

