package sk.majba.items;

public class Item {
    private final String name;
    private final ItemType itemType;
    private final int price;
    private final int powerPoints;

    public Item(String name, ItemType itemType, int price, int powerPoints) {
        this.name = name;
        this.itemType = itemType;
        this.price = price;
        this.powerPoints = powerPoints;
    }

    public String getName() {
        return this.name;
    }

    public ItemType getItemType() {
        return this.itemType;
    }

    public int getPrice() {
        return this.price;
    }

    public int getPowerPoints() {
        return this.powerPoints;
    }
}
