package Sep.Sep23.Inheritance.Multilevel.e2;


public class Tesla extends Car{

    public Tesla(int i) {
        super(i); // super -> Car?
    }

    void topSpeed(){
        System.out.println("I am Tesla!!");
    }

}