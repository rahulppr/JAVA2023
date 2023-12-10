package Sep.Sep23.Polymorphism.MOverloading;


public class MC {
    public static void main(String[] args) {

        Person p = new Person();

        p.Speak();
        p.Speak(1);
        p.Speak(1.3);
        p.Speak("Pramod");

        //Overloading
        //Same Name But different Arg

    }
}

