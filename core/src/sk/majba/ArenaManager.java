package sk.majba;

import sk.majba.items.Item;
import sk.majba.items.itemSet.ItemSet;
import sk.majba.player.*;
import sk.majba.player.exceptions.NotAllAttributesPresentException;


import java.util.*;

public class ArenaManager {
    private Fighter hrac;
    private final Random random;
    private GameArea gameArea;

    public ArenaManager(Fighter hrac, GameArea gameArea) throws NotAllAttributesPresentException {
        this.hrac = hrac;
        this.random = new Random();
        this.gameArea = gameArea;
        this.generateOpponent();
    }

    public Fighter generateOpponent() throws NotAllAttributesPresentException {
        int[] aiAttributes;
        int numberOfAttributePoints = hrac.getAtributy().getAttributePointsTotal();
        aiAttributes = this.attributeGeneration(numberOfAttributePoints);
        Fighter opponent = new Fighter("Artificial the First", hrac.getLevel(), new Atributy(aiAttributes));
        opponent.setGear(this.gearGeneration(hrac.getPowerPoints(), opponent, aiAttributes));
        System.out.println(opponent.toString());
        return null;
    }

    private int[] attributeGeneration(int numberOfAttributePoints) {
        int numberOfAttributes = AttributeType.values().length;
        int[] randomAttributes = new int[numberOfAttributes];
        HashSet<Integer> set = new HashSet<>();

        set.add(numberOfAttributePoints);
        set.add(0);

        while (set.size() <= numberOfAttributes) {
            set.add(1 + this.random.nextInt(numberOfAttributePoints - 1));
        }

        Integer[] randomNumbers = set.toArray(new Integer[numberOfAttributes + 1]);
        Arrays.sort(randomNumbers);

        for (int i = 1; i < randomNumbers.length; ++i) {
            randomAttributes[i - 1] = randomNumbers[i] - randomNumbers[i - 1];
        }

        return randomAttributes;
    }

    private Item[] gearGeneration(int powerPoints, Fighter ai, int[] aiAttributePoints) {
        int actualPowerPoints = ai.getPowerPoints();

        Equipment items = new Equipment();
        ArrayList<Item> alreadyGeneratedItems = new ArrayList<>();
        ArrayList<ItemSet> allowedItemSets =
                new ArrayList<>(this.gameArea.getItemSetsCatalog().filterItemSetsByLevel(ai.getLevel()));

        String[] itemTypes = items.getItemTypes();

        ArrayList<String> allItemTypes = new ArrayList<>(Arrays.asList(itemTypes));

        boolean running = true;
        int randomCategoryNumber;
        while (running) {
            if (allItemTypes.size() > 0) {
                randomCategoryNumber = this.random.nextInt(allItemTypes.size());
                String currentCategory = allItemTypes.get(randomCategoryNumber);
                int randomItemSetNumber = this.random.nextInt(allowedItemSets.size());
                ItemSet randomItemSet = allowedItemSets.get(randomItemSetNumber);
                alreadyGeneratedItems.add(randomItemSet.getItemFromSet(currentCategory));
                allItemTypes.remove(currentCategory);
            }

            if (!items.isFull() || allItemTypes.size() == 0) {
                running = false;
            }
        }

        return alreadyGeneratedItems.toArray(new Item[0]);
    }
}
