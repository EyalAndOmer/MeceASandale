package sk.majba;

import sk.majba.items.ArmorType;
import sk.majba.items.Item;
import sk.majba.items.WeaponRange;

import java.util.HashMap;

public class Equipment {
    private HashMap<String, Item> equipment;

    public Equipment() {
        this.equipment = new HashMap<String, Item>();
        //Naplnenie Equipmentu vsetkymi druhmi armoru
        for (int i = 0; i < ArmorType.values().length; i++) {
            this.equipment.put(ArmorType.values()[i].getArmorType(), null);
        }

        //Naplnenie Equipmentu vsetkymi druhmi rangu zbrani
        for (int i = 0; i < WeaponRange.values().length; i++) {
            this.equipment.put(WeaponRange.values()[i].getWeaponType(), null);
        }
        System.out.println(this.equipment);
    }
}
