package com.example.dannylui.daggerpractice;

import android.os.Bundle;

import com.example.dannylui.daggerpractice.models.ChuckResponse;
import com.example.dannylui.daggerpractice.networks.ChuckNorrisClient;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends BaseActivity {

    @Inject
    ChuckNorrisClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ((App) getApplication()).getInjector().inject(this); // Not needed because baseactivity has injected using component


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
