package sk.majba.arena;

import sk.majba.GameArea;
import sk.majba.items.Item;
import sk.majba.items.itemSet.ItemSet;
import sk.majba.player.*;
import sk.majba.player.exceptions.NotAllAttributesPresentException;


import java.util.*;

public class ArenaManager {
    private Hrac hrac;
    private Fighter opponent;
    private final Random random;
    private GameArea gameArea;

    public ArenaManager(Hrac hrac, GameArea gameArea) throws NotAllAttributesPresentException {
        this.hrac = hrac;
        this.random = new Random();
        this.gameArea = gameArea;
        this.opponent = new Opponent(this.hrac, this.gameArea);

    }

}
