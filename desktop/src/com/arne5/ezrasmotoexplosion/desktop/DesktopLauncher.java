package com.arne5.ezrasmotoexplosion.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.arne5.ezrasmotoexplosion.EzrasMotoExplosion;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

        config.title="Ezra's Moto Explosion";
        config.width = 800;
        config.height = 480;

		new LwjglApplication(new EzrasMotoExplosion(), config);
	}
}
