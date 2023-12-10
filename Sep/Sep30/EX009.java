package Sep.Sep30;

public class EX009 {
    public static void main(String[] args) {

       Hello h = new Hello();
       h.process();
       System.out.println("Hello");

    }
}


class Hello {

    public int process(){
        throw new NullPointerException();
    }
}

