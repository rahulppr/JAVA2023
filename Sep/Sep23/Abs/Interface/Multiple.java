package Sep.Sep23.Abs.Interface;


public class Multiple {
    public static void main(String[] args) {
        C1 c = new C1();
        c.eay();
    }
}

class C1 implements ABB,BA{

    @Override
    public void eay() {
        System.out.println("C from eat()");
    }
}

interface BA{
    int b = 20;
    void eay();
}
interface ABB{
    int a = 10;
    void eay();
}