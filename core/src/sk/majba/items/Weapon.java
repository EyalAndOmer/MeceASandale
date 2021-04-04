package sk.majba.items;

public class Weapon extends Item {

    private WeaponType weaponType;

    public Weapon(String name, ItemType itemType, WeaponType weaponType) {
        super(name, itemType);
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }
}
