package sk.majba.items;

public class ItemSet {
    private final Armor helmet;
    private final Armor chestplate;
    private final Armor upperHand;
    private final Armor lowerHand;
    private final Armor shield;
    private final Armor upperLeg;
    private final Armor lowerLeg;
    private final Armor shoes;
    private final Weapon meleeWeapon;
    private String nazovSetu;

    public ItemSet(String nazovSetu, Armor helmet, Armor chestplate, Armor upperHand, Armor lowerHand, Armor shield,
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
        this.nazovSetu = nazovSetu;
    }
}
