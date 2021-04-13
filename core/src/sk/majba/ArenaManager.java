package sk.majba;

import sk.majba.player.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class ArenaManager {
    private Fighter hrac;
    private final Random random;
    public ArenaManager(Fighter hrac) {
        this.hrac = hrac;
        this.random = new Random();
    }

    public Fighter generateOpponent() {
        int[] aiAttributes = new int[AttributeType.values().length];
        int numberOfAttributePoints = hrac.getAtributy().getAttributePointsTotal();
        System.out.println(Arrays.toString(AttributeGeneration(numberOfAttributePoints)));
        Fighter opponent = new Fighter("Artificial the First", hrac.getLevel(), hrac.getAtributy());
        return null;
    }

    public Attributes randomAttributeGeneration() {
        return null;
    }
}
