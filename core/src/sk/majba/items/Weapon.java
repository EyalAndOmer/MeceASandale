package sk.majba.items;

import java.util.Arrays;

public class Weapon extends Item {

    private WeaponType weaponType;
    private WeaponRange weaponRange;
    private DamageRange damageRange;

    public Weapon(String name, ItemType itemType, WeaponRange weaponRange,WeaponType weaponType,
                  int minimalDmg, int maximalDmg) {
        super(name, itemType);
        this.weaponType = weaponType;
        this.weaponRange = weaponRange;
        this.damageRange = new DamageRange(minimalDmg, maximalDmg);
    }

    public WeaponType getWeaponType() {
        return this.weaponType;
    }

    public WeaponRange getWeaponRange() {
        return this.weaponRange;
    }

    public void getUtok() {
        System.out.println("QUICK");
        for (int i = 0; i < 100; i++) {
            System.out.println(this.damageRange.getDamageUtoku('Q'));
        }
        System.out.println("MEDIUM");
        for (int i = 0; i < 100; i++) {
            System.out.println(this.damageRange.getDamageUtoku('M'));
        }
        System.out.println("HARD");
        for (int i = 0; i < 100; i++) {
            System.out.println(this.damageRange.getDamageUtoku('H'));
        }
    }
}
