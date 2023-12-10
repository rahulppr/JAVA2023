package Sep.Sep17.Ecap.abc.police;


public class Cop {

    private int gun;


    public Cop(int gun){
        this.gun = gun;
    }

    public int getGuns(){
        return gun;
    }

    protected void canIShoot(){
        System.out.println("Yes you can!");
    }

}