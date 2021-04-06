package sk.majba.items;

public enum WeaponType {
    SWORD('S'), AXE('A'), NONBUYABLE('N');

    private final char weaponType;

    WeaponType(char weaponType) {
        this.weaponType = weaponType;
    }

    public char getWeaponType() {
        return this.weaponType;
    }
}
