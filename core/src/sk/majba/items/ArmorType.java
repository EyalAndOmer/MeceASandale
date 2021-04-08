package sk.majba.items;

public enum ArmorType {
    HEAD("head"), CHEST("chest"), ARMS("arms"), SHIELD("shield"), LEGS("legs");

    private final String armorType;

    ArmorType(String armorType) {
        this.armorType = armorType;
    }

    public String getArmorType() {
        return this.armorType;
    }

}
