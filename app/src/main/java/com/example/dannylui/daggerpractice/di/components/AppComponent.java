package com.example.dannylui.daggerpractice.di.components;

import com.example.dannylui.daggerpractice.MainActivity;
import com.example.dannylui.daggerpractice.di.modules.AppModule;
import com.example.dannylui.daggerpractice.di.modules.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by dannylui on 10/5/17.
 */

@Singleton
@Component(modules = {NetworkModule.class, AppModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
//    void inject(BaseActivity activity); // Not needed because of ComponentReflectionInjector

}
