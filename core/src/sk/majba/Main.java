package sk.majba;

import sk.majba.items.*;
import sk.majba.player.Atributy;
import sk.majba.player.Hrac;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Generovanie druhu vyzbroje
        Weapon zbran1 = new Weapon("ostraPalica", ItemType.WEAPON, WeaponRange.MELEE,
                WeaponType.NONBUYABLE, 1, 4, 50, 5);
        Armor helma1 = new Armor("zaciatocnickaHelma", ItemType.ARMOR, ArmorType.HEAD, 300, 20, 150);
        Armor hrudnik1 = new Armor("zaciatocnickyHrudnik", ItemType.ARMOR, ArmorType.CHEST, 1000, 60, 400);
        Armor stit1 = new Armor("zaciatocnickyStit", ItemType.ARMOR, ArmorType.SHIELD, 650, 30, 200);
        Armor ruky1 = new Armor("zaciatocnickyRuky", ItemType.ARMOR, ArmorType.ARMS, 300, 20, 150);
        Armor nohy1 = new Armor("zaciatocnickeNohy", ItemType.ARMOR, ArmorType.LEGS, 200, 10, 100);

        Hrac fero = new Hrac("Fero", 1,
                new Atributy(5, 5, 1, 1, 1, 1), 0, 0);

        fero.setGear(zbran1, helma1, hrudnik1, stit1, ruky1, nohy1);
        Object[] feroveItemy = fero.getEquipment();

        for (int i = 0; i < feroveItemy.length; i++) {
            if (feroveItemy[i] != null) {
                System.out.println(((Item)feroveItemy[i]).getName());
            }
        }

        System.out.println(fero.getPowerPoints());


    }
}
