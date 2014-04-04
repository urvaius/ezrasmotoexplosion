package com.arne5.ezrasmotoexplosion.desktop;

import com.arne5.ezrasmotoexplosion.EzrasMotoExplosion;
import com.arne5.ezrasmotoexplosion.GameScreen;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

        config.title="Ezra's Moto Explosion";
        config.width = 800;
        config.height = 480;

		new LwjglApplication(new EzrasMotoExplosion(), config);


	}
}
