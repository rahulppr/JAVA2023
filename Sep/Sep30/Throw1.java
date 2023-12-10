package Sep.Sep30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throw1 {
    public static void main(String[] args) throws Exception {

            String path = "C:/dog.txt";
            FileInputStream f = new FileInputStream(path);

    }
}
//We can use both try-catch process or throws Exception
//Difference b/w throws and throw

//How we know in which condition
// we have to use??
// try-catch or throw Exception on method i.e. Add an Exception to Overall method  , see the TTO2

