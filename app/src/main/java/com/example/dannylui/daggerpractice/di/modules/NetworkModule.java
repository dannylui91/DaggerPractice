package com.example.dannylui.daggerpractice.di.modules;

import com.example.dannylui.daggerpractice.networks.ChuckNorrisClient;
import com.example.dannylui.daggerpractice.networks.ChuckNorrisService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dannylui on 10/5/17.
 */

@Module
public class NetworkModule {

    @Provides
    @Singleton
    Retrofit providesRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(ChuckNorrisClient.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Provides
    @Singleton
    ChuckNorrisService providesChuckNorrisService(Retrofit retrofit) {
        return retrofit.create(ChuckNorrisService.class);
    }

//    @Provides
//    @Singleton
//    @Named("Daniel")
//    ChuckNorrisService providesChuckNorrisService2(Retrofit retrofit) {
//        return retrofit.create(DanielService.class);
//    }

    @Provides
    @Singleton
    ChuckNorrisClient providesChuckNorrisClient(ChuckNorrisService service) {
        return new ChuckNorrisClient(service);
    }
}
