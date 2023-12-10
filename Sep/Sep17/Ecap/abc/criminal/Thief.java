package Sep.Sep17.Ecap.abc.criminal;

import Sep.Sep17.Ecap.abc.police.Cop;

public class Thief {
    public static void main(String[] args) {

        Cop cop = new Cop(10);
//        int g = cop.gun;
        int bullet = cop.getGuns();
        System.out.println(bullet);
        // cop.canIShoot();


    }
}