package com.example.droiddojo;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.droiddojo.Model.Response;
import com.example.droiddojo.Service.RetrofitUsuario;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    public TextInputEditText login;
    public TextInputEditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login_usuario);
        senha = findViewById(R.id.senha_usuario);


        UsuarioInterface service = RetrofitUsuario.getRetrofitUsuario().create(UsuarioInterface.class);
        Call<Response> call = service.getUsuario("rnovellis","1234");
        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {

            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });
    }
}
