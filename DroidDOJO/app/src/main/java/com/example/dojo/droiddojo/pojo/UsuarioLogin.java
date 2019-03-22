package com.example.dojo.droiddojo.pojo;

import com.google.gson.annotations.SerializedName;

public class UsuarioLogin {



    @SerializedName("id")
    private int id;
    @SerializedName("senha")
    private String senha;
    @SerializedName("login")
    private String login;
    @SerializedName("id")
    private String nome;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
