package com.arne5.ezrasmotoexplosion.android;

import android.os.Bundle;

import com.arne5.ezrasmotoexplosion.EzrasMotoExplosion;
import com.arne5.ezrasmotoexplosion.GameScreen;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        config.useAccelerometer = false;
        config.useCompass = false;
		//initialize(new GameScreen(), config);
        initialize(new EzrasMotoExplosion(),config);

	}
}
