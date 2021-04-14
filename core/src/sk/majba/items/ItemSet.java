package sk.majba.items;

import sk.majba.player.Fighter;

import java.util.Arrays;
import java.util.HashMap;

public class ItemSet {
    private Item[] itemSetItems;
    private int unlockLvl;
    public ItemSet(int unlockLvl, Item...items) throws NotAllItemsRequiredForItemSetException {
        int totalItems = WeaponRange.values().length + ArmorType.values().length;
        if (items.length != totalItems) {
            throw new NotAllItemsRequiredForItemSetException("Number of items in set is lower or greater than the " +
                    "required number.");
        }
        HashMap<String, Item> copyOfItems = new HashMap<>();

        for (Item item : items) {
            if (item != null) {
                if (item instanceof Armor) {
                    if (copyOfItems.containsKey(((Armor) item).getArmorType().getArmorType())) {
                        throw new NotAllItemsRequiredForItemSetException("Duplicate equipment types found.");
                    } else {
                        copyOfItems.put(((Armor) item).getArmorType().getArmorType(), item);
                    }
                } else if (item instanceof Weapon) {
                    if (copyOfItems.containsKey(((Weapon) item).getWeaponRange().getWeaponType())) {
                        throw new NotAllItemsRequiredForItemSetException("Duplicate equipment types found.");
                    } else {
                        copyOfItems.put(((Weapon) item).getWeaponType().getWeaponType(), item);
                    }
                }
            }
        }
        this.itemSetItems = new Item[items.length];
        System.arraycopy(items, 0, this.itemSetItems, 0, items.length);

        this.unlockLvl = unlockLvl;
    }

    public boolean isUnlocked(Fighter fighter) {
        return this.unlockLvl >= fighter.getLevel();
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < this.itemSetItems.length; i++) {
            if (this.itemSetItems[i] != null) {
                output.append(this.itemSetItems[i].getName()).append("\n");
            }
        }
        return "ItemSet{" +
                output.toString() +
                '}';
    }
}
