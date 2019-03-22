package com.example.dojo.droiddojo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText usuarioLogin;
    private EditText senhaLogin;
    private Button btnLogin;
    private boolean loginVerificado = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuarioLogin = findViewById(R.id.usuarioDigitado);
        senhaLogin = findViewById(R.id.senhaDigitado);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(verificaUsuarior()){
                    Intent intent = new Intent(v.getContext(),MostrarListaActivity.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(v.getContext(),"nao passa",Toast.LENGTH_LONG).show();

                }
            }
        });
    }



    //parte mocada trocar

    private boolean verificaUsuarior() {
        if (usuarioLogin.getText().toString().equalsIgnoreCase("joao") &&
                senhaLogin.getText().toString().equalsIgnoreCase("1234")){
            loginVerificado = !loginVerificado;
            }else{

            Toast.makeText(this,"nao autorizado",Toast.LENGTH_LONG).show();
        }
        return  loginVerificado;
    }
}
