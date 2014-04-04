package com.arne5.ezrasmotoexplosion;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by darneson on 4/4/2014.
 */
public class EzrasMotoExplosion extends Game {

    public SpriteBatch batch;
    public BitmapFont font;

    public void create(){
        batch = new SpriteBatch();
        //use libgdx arial font
        font = new BitmapFont();
        this.setScreen(new MainMenuScreen(this));

    }
    public void render(){
        super.render();//imortant
    }
    public void dispose(){
        batch.dispose();
        font.dispose();

    }

}
