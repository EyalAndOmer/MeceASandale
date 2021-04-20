package sk.majba.items;

import sk.majba.player.Fighter;

import java.util.Arrays;
import java.util.HashMap;

public class ItemSet {
    private HashMap<String, Item> itemSetItems;
    private int unlockLvl;
    public ItemSet(int unlockLvl, Item...items) throws NotAllItemsRequiredForItemSetException {
        int totalItems = WeaponRange.values().length + ArmorType.values().length;
        if (items.length != totalItems) {
            throw new NotAllItemsRequiredForItemSetException("Number of items in set is lower or greater than the " +
                    "required number.");
        }
        this.itemSetItems = new HashMap<>();

        for (Item item : items) {
            if (item != null) {
                if (item instanceof Armor) {
                    if (this.itemSetItems.containsKey(((Armor)item).getArmorType().getArmorType())) {
                        throw new NotAllItemsRequiredForItemSetException("Duplicate equipment types found.");
                    } else {
                        this.itemSetItems.put(((Armor)item).getArmorType().getArmorType(), item);
                    }
                } else if (item instanceof Weapon) {
                    if (this.itemSetItems.containsKey(((Weapon)item).getWeaponRange().getWeaponType())) {
                        throw new NotAllItemsRequiredForItemSetException("Duplicate equipment types found.");
                    } else {
                        this.itemSetItems.put(((Weapon)item).getWeaponRange().getWeaponType(), item);
                    }
                }
            }
        }

        this.unlockLvl = unlockLvl;
    }

    public boolean isUnlocked(Fighter fighter) {
        return this.unlockLvl >= fighter.getLevel();
    }

    public Item[] getItemSetItems() {
        return this.itemSetItems.values().toArray(new Item[0]);
    }

    public Item getItemFromSet(String itemType) {
        return this.itemSetItems.get(itemType);
    }



    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        Item[] itemsInSet = this.itemSetItems.values().toArray(new Item[0]);
        for (int i = 0; i < itemsInSet.length; i++) {
            if (itemsInSet[i] != null) {
                output.append(itemsInSet[i].getName()).append("\n");
            }
        }
        return "ItemSet{" +
                output.toString() +
                '}';
    }
}
