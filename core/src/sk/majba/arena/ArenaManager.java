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

    public void startFight() {
        boolean fighting = true;

        Fighter[] fightingFighters = new Fighter[2];
        fightingFighters[0] = this.hrac;
        fightingFighters[1] = this.opponent;
        Fighter winner = null;
        int activeTurn = 0;

        while (fighting) {
            if (fightingFighters[activeTurn].isDead()) {
                fighting = false;
                if (activeTurn == 0) {
                    winner = this.hrac;
                } else {
                    winner = this.opponent;
                }
            }

            if (activeTurn == 0) {
                activeTurn = 1;
            } else {
                activeTurn = 0;
            }
        }

        if (winner == this.hrac) {
            this.playerWon();
        } else {
            this.playerLost();
        }
    }

    private void playerLost() {
    }

    private void playerWon() {
    }

}
