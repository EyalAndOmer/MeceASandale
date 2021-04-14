package sk.majba;

import sk.majba.items.ItemSet;
import sk.majba.player.Atributy;
import sk.majba.player.AttributeType;
import sk.majba.player.Fighter;
import sk.majba.player.NotAllAttributesPresentException;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class ArenaManager {
    private Fighter hrac;
    private final Random random;
    private GameArea gameArea;
    public ArenaManager(Fighter hrac, GameArea gameArea) {
        this.hrac = hrac;
        this.random = new Random();
        this.gameArea = gameArea;
    }

    public Fighter generateOpponent() throws NotAllAttributesPresentException {
        int[] aiAttributes = new int[AttributeType.values().length];
        int numberOfAttributePoints = hrac.getAtributy().getAttributePointsTotal();
        aiAttributes = this.attributeGeneration(numberOfAttributePoints);
        Fighter opponent = new Fighter("Artificial the First", hrac.getLevel(), new Atributy(aiAttributes));
        return null;
    }

    private int[] attributeGeneration(int number) {
        int numberOfAttributes = AttributeType.values().length;
        int[] randomAttributes = new int[numberOfAttributes];
        HashSet<Integer> set = new HashSet<Integer>();
        Integer[] randomNumbers = set.toArray(new Integer[numberOfAttributes + 1]);

        set.add(number);
        set.add(0);

        while (set.size() <= numberOfAttributes) {
            set.add(1 + this.random.nextInt(number - 1));
        }

        Arrays.sort(randomNumbers);

        for(int i = 1; i < randomNumbers.length; ++i) {
            randomAttributes[i - 1] = randomNumbers[i] - randomNumbers[i - 1];
        }

        return randomAttributes;
    }

    private void gearGeneration(int powerPoints, Fighter ai, int[] aiAttributePoints) {
        int actualPowerPoints = ai.getPowerPoints();

        ArrayList<ItemSet> itemSets = new ArrayList<>(this.gameArea.getItemSets());


//        while()



    }
}
