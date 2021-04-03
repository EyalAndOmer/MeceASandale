package sk.majba.screens;

import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenAccessor;
import aurelienribon.tweenengine.TweenManager;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import sk.majba.tween.SpriteAccessor;

import java.awt.*;

public class MainMenu implements Screen {

    private BitmapFont font;
    private Texture texture;
    private SpriteBatch batch;
    private TweenManager tweenManager;
    private Sprite splash;

    public MainMenu() {
        this.font = new BitmapFont();
        this.batch = new SpriteBatch();
    }


    @Override
    public void show() {
        Texture splashTexture = new Texture("01.png");
        splash = new Sprite(splashTexture);

        tweenManager = new TweenManager();
        Tween.registerAccessor(Sprite.class, new SpriteAccessor());

        Tween.set(splash, SpriteAccessor.ALPHA).target(0).start(tweenManager);
        Tween.to(splash, SpriteAccessor.ALPHA, 2).target(1).start(tweenManager);
        Tween.to(splash, SpriteAccessor.ALPHA, 2).target(0).delay(2).start(tweenManager);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        tweenManager.update(delta);

        batch.begin();
        batch.draw(splash, 80, 100);
        font.draw(batch, "Vitaj v mojej hre", 50, 50);
        batch.end();

    }


    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        batch.dispose();
        splash.getTexture().dispose();
    }
}
