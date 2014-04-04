package com.arne5.ezrasmotoexplosion;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.Gdx;

/**
 * Created by darneson on 4/4/2014.
 */
public class MainMenuScreen implements Screen {

    final EzrasMotoExplosion game;

    OrthographicCamera camera;

    public MainMenuScreen(final EzrasMotoExplosion gam){
        game = gam;

        camera = new OrthographicCamera();
        camera.setToOrtho(false,800,480);
    }
    @Override
    public void render(float delta){
        Gdx.gl.glClearColor(0,0,0.2f,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        game.batch.begin();
        game.font.draw(game.batch, "Ezra's Moto Explosion ", 100,150);
        game.font.draw(game.batch, "Tap anywhere to begin!",100,100);
        game.batch.end();

        if (Gdx.input.isTouched()){
            game.setScreen(new GameScreen(game));
            dispose();
        }

    }
    @Override
    public void resize(int width, int height){

    }
    @Override
    public void show(){

    }
    @Override
    public void hide(){

    }
    @Override
    public void pause(){

    }
    @Override
    public void resume(){

    }
    @Override
    public void dispose(){

    }


}
