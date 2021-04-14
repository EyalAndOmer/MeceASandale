package sk.majba.items;

public enum WeaponType {
    SWORD("sword"), AXE("axe"), BOW("bow"), NONBUYABLE("nonbuyable");

    private final String weaponType;

    WeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String getWeaponType() {
        return this.weaponType;
    }
}
