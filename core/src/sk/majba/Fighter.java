package sk.majba;

import sk.majba.items.Armor;
import sk.majba.items.Item;
import sk.majba.items.Weapon;

public class Fighter {
    private String meno;
    private int level;
    private Atributy atributy;

    private Armor helmet;
    private Armor chestplate;
    private Armor upperHand;
    private Armor lowerHand;
    private Armor shield;
    private Armor upperLeg;
    private Armor lowerLeg;
    private Armor shoes;
    private Weapon meleeWeapon;

    public static final int MAXIMAL_LVL = 45;

    public Fighter(String meno, int level, Atributy atributy) {
        this.meno = meno;
        this.level = level;
        this.atributy = atributy;

//        items[0] = this.helmet;
//        items[1] = this.chestplate;
//        items[2] = this.upperHand;
//        items[3] = this.lowerHand;
//        items[4] = this.shield;
//        items[5] = this.upperLeg;
//        items[6] = this.lowerLeg;
//        items[7] = this.shoes;
//        items[8] = this.meleeWeapon;

    }

    public String getMeno() {
        return meno;
    }

    public int getLevel() {
        return level;
    }

    public Atributy getAtributy() {
        return atributy;
    }

    public void setAtributy(Atributy atributy) {
        this.atributy = atributy;
    }



}
