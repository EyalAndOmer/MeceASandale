package sk.majba.player;

import sk.majba.items.Armor;
import sk.majba.items.ArmorType;
import sk.majba.items.Item;
import sk.majba.items.Weapon;
import sk.majba.items.WeaponRange;

import java.util.*;

public class Equipment {
    private HashMap<String, Item> equipment;
    private int numberOfItems;

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

        this.numberOfItems = this.equipment.size();
    }

    public HashMap<String, Item> getEquipment() {
        return new HashMap<>(this.equipment);
    }

    public void setGear(Item item) {
        if (item instanceof Weapon) {
            this.equipment.put(((Weapon)item).getWeaponRange().getWeaponType(), item);
        } else if (item instanceof Armor) {
            this.equipment.put(((Armor)item).getArmorType().getArmorType(), item);
        }
    }

//    public void setGear(ArrayList<Item> items) {
//        for (int i = 0; i < items.size(); i++) {
//            if (items.get(i) instanceof Weapon) {
//                this.equipment.put(((Weapon)items.get(i)).getWeaponRange().getWeaponType(), items.get(i));
//            } else if (items.get(i) instanceof Armor) {
//                this.equipment.put(((Armor)items.get(i)).getArmorType().getArmorType(), items.get(i));
//            }
//        }
//    }

    public boolean isFull() {
        //Naplnenie Equipmentu vsetkymi druhmi armoru
        for (int i = 0; i < ArmorType.values().length; i++) {
            if (!this.equipment.containsKey(ArmorType.values()[i].getArmorType())) {
                return false;
            }
        }

        //Naplnenie Equipmentu vsetkymi druhmi rangu zbrani
        for (int i = 0; i < WeaponRange.values().length; i++) {
            if (!this.equipment.containsKey(WeaponRange.values()[i].getWeaponType())) {
                return false;
            }
        }

        return true;
    }

    public String[] getItemTypes() {
        return this.equipment.keySet().toArray(new String[0]);
    }

    public int getNumberOfItems() {
        return this.numberOfItems;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ArmorType.values().length; i++) {
            stringBuilder.append(ArmorType.values()[i].getArmorType()).append(" ");

            try {
                stringBuilder.append(this.equipment.get(ArmorType.values()[i].getArmorType()).getName()).append("\n");
            } catch (NullPointerException e) {
                stringBuilder.append("nic").append("\n");
            }
        }


        for (int i = 0; i < WeaponRange.values().length; i++) {
            stringBuilder.append(WeaponRange.values()[i].getWeaponType()).append(" ");
            try {
                stringBuilder.append(this.equipment.get(WeaponRange.values()[i].getWeaponType()).getName()).append("\n");
            } catch (NullPointerException e) {
                stringBuilder.append("nic").append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
