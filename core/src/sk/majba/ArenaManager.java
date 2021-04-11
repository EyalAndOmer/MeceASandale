package sk.majba;

import sk.majba.player.Fighter;

import java.util.jar.Attributes;

public class ArenaManager {
    private Fighter hrac;
    public ArenaManager(Fighter hrac) {
        this.hrac = hrac;
    }

    public Fighter generateOpponent() {
        Fighter opponent = new Fighter("Artificial the First", hrac.getLevel(), hrac.getAtributy());
        return null;
    }

    public Attributes randomAttributeGeneration() {
        return null;
    }
}
