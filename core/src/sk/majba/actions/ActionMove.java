package sk.majba.actions;

import sk.majba.player.AttributeType;
import sk.majba.player.Fighter;

public class ActionMove extends Action implements IPerformableAction<Integer> {
    public ActionMove(AttributeType... neededAttributes) {
        super(neededAttributes);
    }

    @Override
    public void performAction(Fighter fighter, Integer... values) {

    }
}
