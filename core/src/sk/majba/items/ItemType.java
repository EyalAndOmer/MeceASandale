package sk.majba.items;

public enum ItemType {
    ARMOR('A'), WEAPON('W');

    private final char itemType;

    ItemType(char itemType) {
        this.itemType = itemType;
    }

    public char getItemType() {
        return this.itemType;
    }
}
