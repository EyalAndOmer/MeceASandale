package sk.majba.actions;

import sk.majba.player.AttributeType;

/**
 * Trieda Action bude mat na starosti kazdu akciu, ktora sa stane v hre
 */
public abstract class Action {
    private final AttributeType[] neededAttributes;
    private int actionModifier;

    public Action(AttributeType ...neededAttributes) {
        this.neededAttributes = new AttributeType[neededAttributes.length];
        System.arraycopy(neededAttributes, 0, this.neededAttributes, 0, neededAttributes.length);
    }

    public AttributeType[] getNeededAttributes() {
        return this.neededAttributes;
    }

}
