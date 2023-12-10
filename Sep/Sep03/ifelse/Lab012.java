package Sep.Sep03.ifelse;
import java.util.Scanner;

public class Lab012 {
    public static void main(String[] args) {
        //Write a Program that classifies a triangle based on its side length
        //Given Inputs values representing the length of the sides.
        //Determine if all the side sare equal (Equilateral).
        //Isosceles (If two sides are equal) and Scalene (no sides are equal)
        //Use an if-else statement

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Three Sides");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        if(side1 == side2 && side2 == side3 ){
            System.out.println("Equilateral Triangle");
        } else if (side1 == side2 || side1==side3 || side2==side3) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}

