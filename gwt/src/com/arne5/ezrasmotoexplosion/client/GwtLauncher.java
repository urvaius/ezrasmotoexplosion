package com.arne5.ezrasmotoexplosion.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.arne5.ezrasmotoexplosion.EzrasMotoExplosion;

public class GwtLauncher extends GwtApplication {

        @Override
        public GwtApplicationConfiguration getConfig () {
                return new GwtApplicationConfiguration(800, 480);
        }


        @Override
        public ApplicationListener getApplicationListener () {
                return new EzrasMotoExplosion();
        }
}