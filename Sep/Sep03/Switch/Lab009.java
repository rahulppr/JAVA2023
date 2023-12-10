package Sep.Sep03.Switch;



import java.util.Scanner;

public class Lab009 {
    public static void main(String[] args) {
        //Simulate a Traffic Light with possible states : "Red","Yellow" and "Green"
        //WAP that takes as an Integer representing the current
        //state of the traffic light and prints the next state.
        // Use a switch statement to cycle through statement

        //1-->Red-->Yellow
        //2-->Yellow-->Green
        //3-->Green-->Red

        //Yellow-->Green-->Red ---- India

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current State from 1-3 in which you are in?");
        int state = sc.nextInt();

        switch(state){
            case 1:
                System.out.println("Next state will be Yellow");
                break;
            case 2:
                System.out.println("Next state will be Green");
                break;
            case 3:
                System.out.println("Next state will be Red");
                break;
            default:
                System.out.println("Invalid State");
        }

    }
}


