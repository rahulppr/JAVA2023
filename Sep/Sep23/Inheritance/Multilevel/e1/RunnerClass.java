package Sep.Sep23.Inheritance.Multilevel.e1;


public class RunnerClass {
    public static void main(String[] args) {
        Animal a = new BullDog();
        a.eat();
        //a.gaurd();
        BullDog b = new BullDog();
        b.gaurd();


    }
}

