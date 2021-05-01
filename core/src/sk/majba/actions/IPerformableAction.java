package sk.majba.actions;

import sk.majba.player.Fighter;

public interface IPerformableAction<T> {
    void performAction(Fighter fighter, T ...values);
}
