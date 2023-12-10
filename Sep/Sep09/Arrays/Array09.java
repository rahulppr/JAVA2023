package Sep.Sep09.Arrays;


public class Array09 {
    public static void main(String[] args) {

        int [][][] array3D = new int [2][3][4];

        //x->2 , index-->0,1
        //y->3 , index-->0,1,2
        //z->4 ,index-->0,1,2,3

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3 ; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print("*" +" ");
                }
            }
        }
    }
}

