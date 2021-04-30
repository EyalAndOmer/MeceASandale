package sk.majba.items;

import java.util.ArrayList;

public class ItemSetsCatalog {
    private final ArrayList<ItemSet> itemSets;

    public ItemSetsCatalog() {
        this.itemSets = new ArrayList<>();
    }
    
    public void addItemSets(ItemSet ... itemSet) throws DuplicateItemSetException {
        for (int i = 0; i < itemSet.length; i++) {
            if (this.itemSets.contains(itemSet[i])) {
                throw new DuplicateItemSetException("Zadany item set uz existuje");
            }
            this.itemSets.add(itemSet[i]);
        }
    }
    
    public ArrayList<ItemSet> filterItemSetsByLevel(int level) {
        ArrayList<ItemSet> filteredItemSets = new ArrayList<>();

        for (int i = 0; i < this.itemSets.size(); i++) {
            if (this.itemSets.get(i).getUnlockLvl() == level) {
                filteredItemSets.add(this.itemSets.get(i));
            }
        }
        return filteredItemSets;
    }
}
