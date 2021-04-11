package sk.majba.player;

import sk.majba.items.*;

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
            this.equipment.put(WeaponRange.values()[i].toString(), null);
        }
        System.out.println(this.equipment);
    }

    public HashMap<String, Item> getEquipment() {
        return new HashMap<>(this.equipment);
    }

    public void setGear(Item item) {
        if (item instanceof Weapon) {
            this.equipment.put(((Weapon)item).getWeaponRange().toString(), item);
        } else if (item instanceof Armor) {
            this.equipment.put(((Armor)item).getArmorType().toString(), item);
        }
    }
}