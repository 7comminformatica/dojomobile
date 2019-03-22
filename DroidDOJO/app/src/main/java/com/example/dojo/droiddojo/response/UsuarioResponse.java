package com.example.dojo.droiddojo.response;

import com.example.dojo.droiddojo.pojo.UsuarioLogin;

public class UsuarioResponse {
    private int status;
    private String message;
    private UsuarioLogin data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UsuarioLogin getData() {
        return data;
    }

    public void setData(UsuarioLogin data) {
        this.data = data;
    }
}
