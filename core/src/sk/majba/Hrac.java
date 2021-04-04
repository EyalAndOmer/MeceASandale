package sk.majba;

public class Hrac {
    private String meno;
    private int level;
    private Atributy atributy;
    private int xp;
    private int xpNeededToLvlUp;

    public Hrac(String meno, int level, Atributy atributy, int xp) {
        this.meno = meno;
        this.level = level;
        this.atributy = atributy;
        this.xp = xp;
        this.xpNeededToLvlUp = 1000;
    }

    public void levelUp(Atributy atributy) {
        this.xp = 0;
        this.xpNeededToLvlUp *= 2;
        this.atributy = atributy;
    }

    @Override
    public String toString() {
        return "sk.majba.Hrac{" +
                "meno='" + meno + '\'' +
                ", level=" + level +
                ", atributy=" + atributy.toString() +
                '}';
    }
}
