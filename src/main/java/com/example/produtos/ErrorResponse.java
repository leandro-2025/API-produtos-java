package com.example.produtos;

public class ErrorResponse {

    private int status;
    private String erro;
    private String data;

    public ErrorResponse(int status, String erro, String data) {
        this.status = status;
        this.erro = erro;
        this.data = data;
    }

    public int getStatus() {
        return  status;
    }
    public String getErro() {
        return  erro;
    }
    public String getData() {
        return  data;
    }
}
