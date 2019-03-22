package com.example.droiddojo;

import com.example.droiddojo.Model.Response;
import com.example.droiddojo.Service.RetrofitUsuario;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UsuarioInterface {


    @GET("/login/:login/:senha")
    Call<Response> getUsuario (String login,
                              String senha);


}
