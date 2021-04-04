package sk.majba;

public class Fighter {
    private String meno;
    private int level;
    private Atributy atributy;
    public static final int MAXIMAL_LVL = 45;

    public Fighter(String meno, int level, Atributy atributy) {
        this.meno = meno;
        this.level = level;
        this.atributy = atributy;
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
