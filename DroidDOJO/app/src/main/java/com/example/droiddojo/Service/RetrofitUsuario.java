package com.example.droiddojo.Service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUsuario {


    private static Retrofit retrofit;
    private static final String BASE_URL = "https://api-7cake.herokuapp.com/";

    public static Retrofit getRetrofitUsuario() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
