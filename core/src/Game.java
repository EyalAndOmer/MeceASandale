import sk.majba.player.Atributy;
import sk.majba.player.Hrac;
import sk.majba.player.NotAllAttributesPresentException;

public class Game {
    private final Hrac player;

    public Game() throws NotAllAttributesPresentException {
        this.player = new Hrac("Fero Prvy", 1, new Atributy(1, 1, 1, 1, 1, 1, 1), 0, 0);
    }

    public void startGame() {

    }
}
