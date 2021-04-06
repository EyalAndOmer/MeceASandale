package sk.majba.items;

public class Armor extends Item{

    private ArmorType armorType;

    public Armor(String name, ItemType itemType, ArmorType armorType, int price) {
        super(name, itemType, price);
        this.armorType = armorType;
    }

    public ArmorType getArmorType() {
        return armorType;
    }
}
