package sk.majba.items;

public enum ArmorType {
    HEAD("head"), CHEST("chest"), UPPERARM("upperarm"), LOWERARM("lowerarm"), SHIELD("shield"), UPPERLEG("uppgerleg"),
    LOWERLEG("lowerleg"), SHOES("shoes");

    private final String armorType;

    ArmorType(String armorType) {
        this.armorType = armorType;
    }

    public String getArmorType() {
        return this.armorType;
    }
}
