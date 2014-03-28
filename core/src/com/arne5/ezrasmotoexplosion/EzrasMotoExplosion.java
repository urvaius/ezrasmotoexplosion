package com.arne5.ezrasmotoexplosion;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;

public class EzrasMotoExplosion extends ApplicationAdapter {
	SpriteBatch batch;
	Texture background1;
    Texture dropImage;
    Texture bucketImage;
    Sound dropSound;
    Music rainMusic;
    Rectangle bucket;

    OrthographicCamera camera;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
        camera = new OrthographicCamera();
        camera.setToOrtho(false,800,480);

        //create the bucket
        bucket = new Rectangle();
        bucket.x= 800 /2 -64/2;
        bucket.y = 20;
        bucket.width =64;
        bucket.height = 64;

        //load testures
		background1 = new Texture("background.png");
        dropImage = new Texture(Gdx.files.internal("droplet.png"));
        bucketImage = new Texture(Gdx.files.internal("bucket.png"));

        //load some sound
        dropSound = Gdx.audio.newSound(Gdx.files.internal("waterdrop.wav"));
        rainMusic = Gdx.audio.newMusic(Gdx.files.internal("rain.mp3"));


        //start background music auto
        rainMusic.setLooping(true);
        rainMusic.play();
}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0.2f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update();

        batch.setProjectionMatrix(camera.combined);
		batch.begin();

		batch.draw(background1, 0, 0);
        batch.draw(bucketImage,bucket.x,bucket.y);

		batch.end();

        //move the bucket change to a bike later yes
        if(Gdx.input.isTouched()){
            Vector3 touchPos = new Vector3();
            touchPos.set(Gdx.input.getX(),Gdx.input.getY(),0);
            camera.unproject(touchPos);
            bucket.x = touchPos.x -64 /2;
        }

        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) bucket.x -= 200 * Gdx.graphics.getDeltaTime();
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) bucket.x += 200 * Gdx.graphics.getDeltaTime();
        if(bucket.x <0) bucket.x=0;
        if(bucket.x >800) bucket.x=800-64;



	}
}
