package com.example.dannylui.daggerpractice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.dannylui.daggerpractice.models.ChuckResponse;
import com.example.dannylui.daggerpractice.networks.ChuckNorrisClient;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by dannylui on 10/5/17.
 */

public class BaseActivity extends AppCompatActivity {

    @Inject
    ChuckNorrisClient client;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



//        ((App) getApplication()).getAppComponent().inject(this);

        ((App) getApplication()).getInjector().inject(this);

        client.getJoke().enqueue(new Callback<ChuckResponse>() {
            @Override
            public void onResponse(Call<ChuckResponse> call, Response<ChuckResponse> response) {
                ChuckResponse response1 = response.body();
                System.out.println(response1.getValue());
            }

            @Override
            public void onFailure(Call<ChuckResponse> call, Throwable t) {

            }
        });
    }
}
