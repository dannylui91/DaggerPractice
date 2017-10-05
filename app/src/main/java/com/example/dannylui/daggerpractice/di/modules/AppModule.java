package com.example.dannylui.daggerpractice.di.modules;

import android.content.Context;

import com.example.dannylui.daggerpractice.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dannylui on 10/5/17.
 */

@Module
public class AppModule {

    private App app;

    public AppModule(App app) {
        this.app = app;
    }

    @Provides
    @Singleton
    Context providesApplicationContext(App app) {
        return app.getApplicationContext();
    }

//    @Provides
//    @Singleton
//    SharedPreferences providesSharedPreferences(Context context) {
//        return new SharedPreferences.Editor();
//    }

//    ChuckNorrisClient providesChuckNorrisClient(ChuckNorrisService service) {
//        return new ChuckNorrisClient(service);
//    }


}
