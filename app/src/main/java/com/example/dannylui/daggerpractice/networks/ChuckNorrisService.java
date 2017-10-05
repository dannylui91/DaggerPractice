package com.example.dannylui.daggerpractice.networks;


import com.example.dannylui.daggerpractice.models.ChuckResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by dannylui on 10/5/17.
 */

public interface ChuckNorrisService {

    @GET("jokes/random")
    Call<ChuckResponse> getJoke();
}
