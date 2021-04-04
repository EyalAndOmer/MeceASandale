package sk.majba;

public class Hrac {
    private String meno;
    private int level;
    private Atributy atributy;

    public Hrac(String meno, int level, Atributy atributy) {
        this.meno = meno;
        this.level = level;
        this.atributy = atributy;
    }

    public void levelUp(Atributy atributy) {
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
