package sk.majba;

public class Hrac extends Fighter{
    private int xp;
    private int xpNeededToLvlUp;

    public Hrac(String meno, int level, Atributy atributy, int xp) {
        super(meno, level, atributy);
        this.xp = xp;
        this.xpNeededToLvlUp = 1000;
    }

    public void levelUp(Atributy atributy) {
        this.xp = 0;
        this.xpNeededToLvlUp *= 2;
        super.setAtributy(atributy);
    }

    @Override
    public String toString() {
        return "sk.majba.Hrac{" +
                "meno='" + super.getMeno() + '\'' +
                ", level=" + super.getLevel() +
                ", atributy=" + super.getAtributy().toString() +
                '}';
    }
}
