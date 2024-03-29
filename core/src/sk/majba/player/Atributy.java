package sk.majba.player;

import sk.majba.player.exceptions.NotAllAttributesPresentException;

public class Atributy {
    private final int[] attributePoints;
    private int attributePointsTotal;
    public Atributy(int ... attributes) throws NotAllAttributesPresentException {

        if (attributes.length != AttributeType.values().length) {
            throw new NotAllAttributesPresentException("Number of attributes is not equal to the length of " +
                    "AttributeTypes ");
        }
        this.attributePointsTotal = 0;
        this.attributePoints = new int[attributes.length];
        for (int i = 0; i < AttributeType.values().length; i++) {
            this.attributePoints[i] = attributes[i];
            this.attributePointsTotal += attributes[i];
        }
    }

    public int getAttributePointsTotal() {
        return this.attributePointsTotal;
    }

    public int[] getAttributePoints() {
        return this.attributePoints;
    }

    @Override
    public String toString() {
        AttributeType[] attributeTypes = AttributeType.values();
        StringBuilder returnValue = new StringBuilder();
        for (int i = 0; i < attributeTypes.length; i++) {
            returnValue.append(attributeTypes[i].getAttributeName()).append(" ").append(this.attributePoints[i]).append("\n");
        }
        return returnValue.toString();
    }
}
