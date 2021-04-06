package sk.majba;

import sk.majba.items.*;
import sk.majba.player.Atributy;
import sk.majba.player.Hrac;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Weapon zbran1 = new Weapon("ostraPalica", ItemType.WEAPON, WeaponRange.MELEE,
                WeaponType.NONBUYABLE, 1, 4, 50, 5);
        Weapon zbran2 = new Weapon("zeleznyMec", ItemType.WEAPON, WeaponRange.MELEE,
                WeaponType.SWORD, 3, 8, 250, 10);
        Hrac fero = new Hrac("Fero", 1,
                new Atributy(5, 5, 1, 1, 1, 1), 0, 0);

        fero.setGear(zbran1);
        fero.setGear(zbran2);
        Object[] feroveItemy = fero.getEquipment();

        for (int i = 0; i < feroveItemy.length; i++) {
            if (feroveItemy[i] != null) {
                System.out.println(((Item)feroveItemy[i]).getName());
            }
        }


    }
}
