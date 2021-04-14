package sk.majba;

import sk.majba.items.Armor;
import sk.majba.items.ArmorType;
import sk.majba.items.ItemSet;
import sk.majba.items.ItemType;
import sk.majba.items.NotAllItemsRequiredForItemSetException;
import sk.majba.items.Weapon;
import sk.majba.items.WeaponRange;
import sk.majba.items.WeaponType;

import java.util.ArrayList;

public class GameArea {
    private ArrayList<ItemSet> itemSets;
    public GameArea() throws NotAllItemsRequiredForItemSetException {
        this.itemSets = new ArrayList<>();
        //Vytvaranie novych ItemSetov
        Weapon basicMec = new Weapon("basicMec", ItemType.WEAPON, WeaponRange.MELEE,
                WeaponType.SWORD, 2, 6, 50, 500);
        Weapon basicPrak = new Weapon("basicPrak", ItemType.WEAPON, WeaponRange.RANGED, WeaponType.BOW,
                1, 5, 50, 200);
        Armor basicHelma = new Armor("basicHelma", ItemType.ARMOR, ArmorType.HEAD, 300,
                20, 150);
        Armor basicChestplate = new Armor("basicChestplate", ItemType.ARMOR, ArmorType.CHEST, 1000,
                60, 400);
        Armor basicShield = new Armor("basicShield", ItemType.ARMOR, ArmorType.SHIELD, 650,
                30, 200);
        Armor basicRuky = new Armor("basicRuky", ItemType.ARMOR, ArmorType.ARMS, 300,
                20, 150);
        Armor basicNohy = new Armor("basicNohy", ItemType.ARMOR, ArmorType.LEGS, 200,
                10, 100);

        ItemSet basicSet = new ItemSet(1, basicMec, basicPrak, basicHelma, basicChestplate, basicShield,
                basicRuky, basicNohy);
        this.itemSets.add(basicSet);

        Weapon ostraPalica = new Weapon("ostraPalica", ItemType.WEAPON, WeaponRange.MELEE,
                WeaponType.NONBUYABLE, 1, 4, 50, 5);

        ItemSet sedlak = new ItemSet(1, ostraPalica, null, null, null, null, null, null);
        this.itemSets.add(sedlak);

        System.out.println(this.itemSets);
    }

    public ArrayList<ItemSet> getItemSets() {
        return this.itemSets;
    }
}
