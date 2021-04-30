package sk.majba;

import sk.majba.items.*;
import sk.majba.items.exceptions.DuplicateItemSetException;
import sk.majba.items.exceptions.NotAllItemsRequiredForItemSetException;
import sk.majba.items.itemSet.ItemSet;
import sk.majba.items.itemSet.ItemSetsCatalog;

public class GameArea {
    private ItemSetsCatalog itemSetsCatalog;
    public GameArea() throws NotAllItemsRequiredForItemSetException {
        this.itemSetsCatalog = new ItemSetsCatalog();
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

        Weapon ostraPalica = new Weapon("ostraPalica", ItemType.WEAPON, WeaponRange.MELEE,
                WeaponType.NONBUYABLE, 1, 4, 50, 5);

        Weapon beginnerMec = new Weapon("beginnerMec", ItemType.WEAPON, WeaponRange.MELEE,
                WeaponType.SWORD, 2, 6, 50, 500);
        Weapon beginnerLuk = new Weapon("beginnerLuk", ItemType.WEAPON, WeaponRange.RANGED, WeaponType.BOW,
                1, 5, 50, 200);
        Armor beginnerHelma = new Armor("beginnerHelma", ItemType.ARMOR, ArmorType.HEAD, 300,
                20, 150);
        Armor beginnerChestplate = new Armor("beginnerChestplate", ItemType.ARMOR, ArmorType.CHEST, 1000,
                60, 400);
        Armor beginnerShield = new Armor("beginnerShield", ItemType.ARMOR, ArmorType.SHIELD, 650,
                30, 200);
        Armor beginnerRuky = new Armor("beginnerRuky", ItemType.ARMOR, ArmorType.ARMS, 300,
                20, 150);
        Armor beginnerNohy = new Armor("beginnerNohy", ItemType.ARMOR, ArmorType.LEGS, 200,
                10, 100);

        ItemSet beginnerSet = new ItemSet(1, beginnerMec, beginnerLuk, beginnerHelma, beginnerChestplate,
                beginnerShield, beginnerRuky, beginnerNohy);
        ItemSet basicSet = new ItemSet(1, basicMec, basicPrak, basicHelma, basicChestplate, basicShield,
                basicRuky, basicNohy);
        ItemSet sedlak = new ItemSet(1, ostraPalica, null, null, null, null, null, null);

        try {
            this.itemSetsCatalog.addItemSets(sedlak, basicSet, beginnerSet);
        } catch (DuplicateItemSetException e) {
            e.printStackTrace();
        }
    }

    public ItemSetsCatalog getItemSetsCatalog() {
        return itemSetsCatalog;
    }
}
