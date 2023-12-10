package Sep.Sep03.forLoop;


import java.util.Scanner;

public class Lab003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for which table you want?");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n + "X" + i + "=" + n*i);
        }
    }
}

