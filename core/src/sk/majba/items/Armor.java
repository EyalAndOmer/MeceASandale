package sk.majba.items;

public class Armor extends Item{

    private ArmorType armorType;

    public Armor(String name, ItemType itemType, ArmorType armorType) {
        super(name, itemType);
        this.armorType = armorType;
    }

    public ArmorType getArmorType() {
        return armorType;
    }
}
