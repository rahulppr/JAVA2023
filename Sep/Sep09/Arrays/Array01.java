package Sep.Sep09.Arrays;


public class Array01 {
    public static void main(String[] args) {

        //Array--->     //Collection of elements of same data type in contiguous memory location

        int [] numbers = {90,87,92,89}; //representing the array
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        // System.out.println(numbers[4]); //Error: ArrayIndexOutOfBoundsException

        System.out.println("----------------");
        //Another way of array inserting
        int [] numbers2 = new int [4]; //2nd way of representing the array.
        numbers2[0] = 85;
        numbers2[1] = 87;
        numbers2[2] = 89;
        numbers2[3] = 90;
        // numbers2[4] = 98;
        System.out.println(numbers2[3]);

    }
}
