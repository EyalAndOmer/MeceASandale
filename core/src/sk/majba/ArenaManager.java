package sk.majba;

import sk.majba.items.ArmorType;
import sk.majba.items.Item;
import sk.majba.items.ItemSet;
import sk.majba.items.WeaponRange;
import sk.majba.player.*;
import java.util.TreeMap;


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
        int[] aiAttributes = new int[AttributeType.values().length];
        int numberOfAttributePoints = hrac.getAtributy().getAttributePointsTotal();
        aiAttributes = this.attributeGeneration(numberOfAttributePoints);
        Fighter opponent = new Fighter("Artificial the First", hrac.getLevel(), new Atributy(aiAttributes));
        this.gearGeneration(hrac.getPowerPoints(), opponent, aiAttributes);
        return null;
    }

    private int[] attributeGeneration(int number) {
        int numberOfAttributes = AttributeType.values().length;
        int[] randomAttributes = new int[numberOfAttributes];
        HashSet<Integer> set = new HashSet<Integer>();

        set.add(number);
        set.add(0);

        while (set.size() <= numberOfAttributes) {
            set.add(1 + this.random.nextInt(number - 1));
        }

        Integer[] randomNumbers = set.toArray(new Integer[numberOfAttributes + 1]);
        Arrays.sort(randomNumbers);

        for (int i = 1; i < randomNumbers.length; ++i) {
            randomAttributes[i - 1] = randomNumbers[i] - randomNumbers[i - 1];
        }

        return randomAttributes;
    }

    private void gearGeneration(int powerPoints, Fighter ai, int[] aiAttributePoints) {
        int actualPowerPoints = ai.getPowerPoints();

        ArrayList<Item> allItems = new ArrayList<>();

        //Ziskaj vsetky itemy
        for (int i = 0; i < this.gameArea.getItemSets().size(); i++) {
            for (int j = 0; j < this.gameArea.getItemSets().get(i).getItemSetItems().length; j++) {
                if (this.gameArea.getItemSets().get(i).getItemSetItems()[j] != null) {
                    allItems.add(this.gameArea.getItemSets().get(i).getItemSetItems()[j]);
                }
            }
        }

        ArrayList<TreeMap<Integer, Item>> allItemCategorized = new ArrayList<>();
        Equipment items = new Equipment();
        ArrayList<Item> alreadyGeneratedItems = new ArrayList<>();
        ArrayList<ItemSet> allItemSets = new ArrayList<>(this.gameArea.getItemSets());

        String[] itemTypes = items.getItemTypes();

        ArrayList<String> allItemTypes = new ArrayList<>(Arrays.asList(itemTypes));

        boolean running = true;
        int randomCategoryNumber;
        while (running) {
            if (allItemTypes.size() > 0) {
                randomCategoryNumber = this.random.nextInt(allItemTypes.size());
                String currentCategory = allItemTypes.get(randomCategoryNumber);
                int randomItemSetNumber = this.random.nextInt(allItemSets.size());
                ItemSet randomItemSet = allItemSets.get(randomItemSetNumber);
                alreadyGeneratedItems.add(randomItemSet.getItemFromSet(currentCategory));
                allItemTypes.remove(currentCategory);
            }

            if (!items.isFull() || allItemTypes.size() == 0) {
                running = false;
            }
        }
        items.setGear(alreadyGeneratedItems);
        System.out.println(items.toString());

    }
}
