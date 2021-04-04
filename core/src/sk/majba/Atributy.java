package sk.majba;

public class Atributy {
    private int strenght;
    private int agility;
    private int attack;
    private int defence;
    private int charisma;
    private int stamina;

    public Atributy(int strenght, int agility, int attack, int defence, int charisma, int stamina) {
        this.strenght = strenght;
        this.agility = agility;
        this.attack = attack;
        this.defence = defence;
        this.charisma = charisma;
        this.stamina = stamina;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public String toString() {
        return "sk.majba.Atributy{" +
                "strenght=" + strenght +
                ", agility=" + agility +
                ", attack=" + attack +
                ", defence=" + defence +
                ", charisma=" + charisma +
                ", stamina=" + stamina +
                '}';
    }
}
