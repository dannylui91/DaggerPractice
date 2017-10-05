package com.example.dannylui.daggerpractice.networks;

import com.example.dannylui.daggerpractice.models.ChuckResponse;

import retrofit2.Call;

/**
 * Created by dannylui on 10/5/17.
 */

public class ChuckNorrisClient {
    public static final String BASE_URL = "https://api.chucknorris.io";

    private ChuckNorrisService service;

    public ChuckNorrisClient(ChuckNorrisService service) {
        this.service = service;
    }

    public Call<ChuckResponse> getJoke() {
        return service.getJoke();
    }
}
