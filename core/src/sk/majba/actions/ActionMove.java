package sk.majba.actions;

import sk.majba.player.AttributeType;

public class ActionMove extends Action implements IPerformableAction {
    public ActionMove(AttributeType... neededAttributes) {
        super(neededAttributes);
    }

    @Override
    public void performAction() {

    }
}
