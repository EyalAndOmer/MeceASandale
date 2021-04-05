package sk.majba.items;

public enum WeaponRange {
    RANGED('R'), MELEE('M');

    private final char weaponRange;

    WeaponRange(char weaponRange) {
        this.weaponRange = weaponRange;
    }

    public char getWeaponType() {
        return this.weaponRange;
    }
}
