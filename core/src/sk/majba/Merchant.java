package sk.majba;

import sk.majba.items.Item;
import sk.majba.items.ItemType;

import java.util.HashMap;

public class Merchant {
    private HashMap<ItemType, HashMap<String, Item>> shopInventory;
    private String name;
    private ItemType[] itemTypes;

    public Merchant(Item[] items, String name, ItemType[] itemTypes) {
        this.shopInventory = new HashMap<>();
        this.name = name;
        this.itemTypes = itemTypes;

        for (int i = 0; i < itemTypes.length; i++) {
            HashMap<String, Item> itemsInCategory = new HashMap<>();
            for (int j = 0; j < items.length; j++) {
                if(itemTypes[i].equals(items[i].getItemType())) {
                    itemsInCategory.put(items[i].getName(), items[i]);
                }
            }
            this.shopInventory.put(itemTypes[i], itemsInCategory);
        }
    }
}
