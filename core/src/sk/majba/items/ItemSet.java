package sk.majba.items;

public class ItemSet {
    private Armor helmet;
    private Armor chestplate;
    private Armor upperHand;
    private Armor lowerHand;
    private Armor shield;
    private Armor upperLeg;
    private Armor lowerLeg;
    private Armor shoes;
    private Weapon meleeWeapon;

    public ItemSet(Armor helmet, Armor chestplate, Armor upperHand, Armor lowerHand, Armor shield,
                   Armor upperLeg, Armor lowerLeg, Armor shoes, Weapon meleeWeapon) {
        this.helmet = helmet;
        this.chestplate = chestplate;
        this.upperHand = upperHand;
        this.lowerHand = lowerHand;
        this.shield = shield;
        this.upperLeg = upperLeg;
        this.lowerLeg = lowerLeg;
        this.shoes = shoes;
        this.meleeWeapon = meleeWeapon;
    }
}
