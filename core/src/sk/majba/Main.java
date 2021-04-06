package sk.majba;

import sk.majba.items.ItemType;
import sk.majba.items.Weapon;
import sk.majba.items.WeaponRange;
import sk.majba.items.WeaponType;

public class Main {
    public static void main(String[] args) {
        Weapon zbran1 = new Weapon("ostraPalica", ItemType.WEAPON, WeaponRange.MELEE,
                WeaponType.NONBUYABLE, 1, 4, 50);
        Hrac fero = new Hrac("Fero", 1,
                new Atributy(5, 5, 1, 1, 1, 1), 0, 0);
        System.out.println(fero.toString());
        fero.levelUp(new Atributy(5, 5, 5, 1, 1, 1));
        System.out.println(fero.toString());

    }
}
