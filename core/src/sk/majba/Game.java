package sk.majba;

import sk.majba.arena.ArenaManager;
import sk.majba.items.exceptions.NotAllItemsRequiredForItemSetException;
import sk.majba.player.Atributy;
import sk.majba.player.Hrac;
import sk.majba.player.exceptions.NotAllAttributesPresentException;

public class Game {
    private final GameArea gameArea;
    private final Hrac player;
    private final ArenaManager arenaManager;

    public Game() throws NotAllAttributesPresentException, NotAllItemsRequiredForItemSetException {
        this.player = new Hrac("Fero Prvy", 1, new Atributy(1, 1, 1, 1, 1, 1, 1), 0, 0);
        this.gameArea = new GameArea();
        this.arenaManager = new ArenaManager(this.player, this.gameArea);
    }

    public void startGame() {

    }
}
