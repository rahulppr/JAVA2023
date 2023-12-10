package Sep.Sep09.Arrays;


public class Array08 {
    public static void main(String[] args) {

        //In 1D-->
        //int [] matrix = new int [] or
        //int [] marks = {1,2,3};

//in 2D Array
//     int [][] matrix = {
//             {1,2,3},
//             {4,5,6},
//             {7,8,9}
//     };

        int [][] matrix = {
                {1,0,0}, //if any elements is missing during the
                {4,5,0},  //  insertion then it takes as default values.
                {7,8,9}
        };

        //Another way of 2D matrix Initialisation with declaration

        int [][] matrix2 = new int [3][3];
        matrix2 [0][1] = 1;
        matrix2 [0][2] = 1;
        matrix2 [0][3] = 1;
        matrix2 [1][1] = 1;
        matrix2 [1][2] = 1;
        matrix2 [1][3] = 1;
        matrix2 [2][1] = 1;
        matrix2 [2][2] = 1;
        matrix2 [2][3] = 1;



        //Print all the elements
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}

