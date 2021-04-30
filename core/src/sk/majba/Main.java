package sk.majba;

import sk.majba.items.exceptions.NotAllItemsRequiredForItemSetException;
import sk.majba.player.exceptions.NotAllAttributesPresentException;

public class Main {
    public static void main(String[] args) throws NotAllAttributesPresentException, NotAllItemsRequiredForItemSetException {
        Game game = new Game();
        game.startGame();
    }
}
