package sk.majba.player;

import com.badlogic.gdx.Application;

public class Hrac extends Fighter{
    private int xp;
    private int xpNeededToLvlUp;
    private int gold;

    int powerLevel; //sucet hodnot poweru armoru a zbrane, sluzi na vygenerovanie seberovneho alebo slabsieho CPU supera.

    public Hrac(String meno, int level, Atributy atributy, int xp, int gold) {
        super(meno, level, atributy);
        this.xp = xp;
        this.xpNeededToLvlUp = 1000;
        this.gold = gold;
    }

    /**
     * Proces lvl upu u hraca, zvysovanie atribut o hodnotu
    * @param atributy aktualne atributy hraca
     * @param pointsForLevelUp pocet bodov, ktore hrac moze vlozit do atribut
     */
    public void levelUp(Atributy atributy, int pointsForLevelUp) {
        this.xp = 0;
        this.xpNeededToLvlUp *= 2;
        super.setAtributy(atributy);
    }

    @Override
    public String toString() {
        return "sk.majba.player.Hrac{" +
                "meno='" + super.getMeno() + '\'' +
                ", level=" + super.getLevel() +
                ", atributy=" + super.getAtributy().toString() +
                '}';
    }
}