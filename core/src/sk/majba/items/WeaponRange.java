package sk.majba.items;

public enum WeaponRange {
    RANGED("rangedWeapon"), MELEE("meleeWeapon");

    private final String  weaponRange;

    WeaponRange(String weaponRange) {
        this.weaponRange = weaponRange;
    }

    public String getWeaponType() {
        return this.weaponRange;
    }
}
