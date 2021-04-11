package sk.majba.player;

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

    public int getAttributePoints() {
        return 0;
    }

    @Override
    public String toString() {
        return "sk.majba.player.Atributy{" +
                "strenght=" + strenght +
                ", agility=" + agility +
                ", attack=" + attack +
                ", defence=" + defence +
                ", charisma=" + charisma +
                ", stamina=" + stamina +
                '}';
    }
}
