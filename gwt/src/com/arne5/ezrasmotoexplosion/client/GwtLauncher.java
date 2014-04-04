package com.arne5.ezrasmotoexplosion.client;

import com.arne5.ezrasmotoexplosion.GameScreen;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class GwtLauncher extends GwtApplication {

        @Override
        public GwtApplicationConfiguration getConfig () {
                return new GwtApplicationConfiguration(800, 480);
        }


        @Override
        public ApplicationListener getApplicationListener () {
                return new GameScreen();
        }
}