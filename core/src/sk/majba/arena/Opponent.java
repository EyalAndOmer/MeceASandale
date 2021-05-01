package sk.majba.arena;

import sk.majba.GameArea;
import sk.majba.items.Item;
import sk.majba.items.itemSet.ItemSet;
import sk.majba.player.Atributy;
import sk.majba.player.AttributeType;
import sk.majba.player.Equipment;
import sk.majba.player.Fighter;
import sk.majba.player.Hrac;
import sk.majba.player.exceptions.NotAllAttributesPresentException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Opponent extends Fighter {
    private GameArea gameArea;
    private Random random;

    public Opponent(Hrac hrac, GameArea gameArea) {
        super(hrac);
        this.gameArea = gameArea;
        this.random = new Random();
        try {
            this.setAtributy(new Atributy(
                    this.attributeGeneration(hrac.getAtributy().getAttributePointsTotal())));
        } catch (NotAllAttributesPresentException e) {
            e.printStackTrace();
        }
        setGear(this.gearGeneration(hrac.getPowerPoints(), getAttributePoints()));

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

    private Item[] gearGeneration(int powerPoints, int[] aiAttributePoints) {
        int actualPowerPoints = getPowerPoints();

        Equipment items = new Equipment();
        ArrayList<Item> alreadyGeneratedItems = new ArrayList<>();
        ArrayList<ItemSet> allowedItemSets =
                new ArrayList<>(this.gameArea.getItemSetsCatalog().filterItemSetsByLevel(getLevel()));

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
