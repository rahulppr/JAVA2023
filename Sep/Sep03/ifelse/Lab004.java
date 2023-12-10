package Sep.Sep03.ifelse;


import java.util.Scanner;

public class Lab004 {
    public static void main(String[] args) {
        //How to get input from User??
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a,b,c \n And I will give you the max. no.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Your Input is "+ a +" "+b +" "+c);

        //if statement
        if(a>b && a>c){
            System.out.println(a +"  is greater");
        } if(b>c && b>a){
            System.out.println(b+"  is greater");
        } if(c>a && c>b){
            System.out.println(c +" is greater");
        }
    }
}

