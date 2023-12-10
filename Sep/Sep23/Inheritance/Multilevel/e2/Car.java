package Sep.Sep23.Inheritance.Multilevel.e2;


public class Car extends Vehicle{
    public Car(int i ){
        super(i); // Super -> Vehicle
    }

    void carFunc(){
        System.out.println("Car");
    }
}