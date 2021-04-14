package sk.majba.player;

import sk.majba.items.Armor;
import sk.majba.items.Item;
import sk.majba.items.Weapon;

import java.util.Collection;
import java.util.Set;

public class Fighter {
    private final String meno;
    private final int level;
    private Atributy atributy;
    private Equipment equipment;
    private int powerPoints;

    private int health;
    private int armor;
    private int stamina;

    public static final int MAXIMAL_LVL = 45;
    public static final int ATTRIBUTES_PER_LVL_UP = 4;

    public Fighter(String meno, int level, Atributy atributy) {
        this.meno = meno;
        this.level = level;
        this.atributy = atributy;
        this.equipment = new Equipment();
        this.powerPoints = 0;
    }

    public String getMeno() {
        return meno;
    }

    public int getLevel() {
        return level;
    }

    public Atributy getAtributy() {
        return this.atributy;
    }

    public int[] getAttributePoints() {
        return this.atributy.getAttributePoints();
    }

    public void setAtributy(Atributy atributy) {
        this.atributy = atributy;
    }

    public Object[] getEquipment() {
        return this.equipment.getEquipment().values().toArray();
    }

    public void setGear(Item ... items) {
        for (int i = 0; i < items.length; i++) {
            this.equipment.setGear(items[i]);
        }
        this.setPowerPoints();
    }

    private void setPowerPoints() {
        Object[] setItemov = this.equipment.getEquipment().values().toArray();
        for (int i = 0; i < setItemov.length; i++) {
            if (setItemov[i] != null) {
                this.powerPoints += ((Item)setItemov[i]).getPowerPoints();
            }
        }
    }

    public int getPowerPoints() {
        return this.powerPoints;
    }
}
