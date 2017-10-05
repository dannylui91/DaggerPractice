package com.example.dannylui.daggerpractice;

import android.app.Application;

import com.example.dannylui.daggerpractice.di.components.AppComponent;
import com.example.dannylui.daggerpractice.di.components.DaggerAppComponent;
import com.example.dannylui.daggerpractice.di.modules.AppModule;

/**
 * Created by dannylui on 10/5/17.
 */

public class App extends Application {
    private AppComponent appComponent;
    private ComponentReflectionInjector injector;

    @Override
    public void onCreate() {
        super.onCreate();

//        appComponent = DaggerAppComponent.create();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();



        injector = new ComponentReflectionInjector<>(AppComponent.class, appComponent);


    }

    public ComponentReflectionInjector getInjector() {
        return injector;
    }
}
