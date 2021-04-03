package sk.majba;

import com.badlogic.gdx.Game;
import sk.majba.screens.MainMenu;

public class MeceASandale extends Game {

    @Override
    public void create() {
        setScreen(new MainMenu());
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }

}
