package sk.majba.items;

public class Armor extends Item{

    private ArmorType armorType;
    private int armorValue;

    public Armor(String name, ItemType itemType, ArmorType armorType, int price, int armorValue, int powerPoints) {
        super(name, itemType, price, powerPoints);
        this.armorType = armorType;
        this.armorValue = armorValue;
    }

    public ArmorType getArmorType() {
        return armorType;
    }

    public int getArmorValue() {
        return this.armorValue;
    }
}
