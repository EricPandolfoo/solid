package com.eric.solid.srp.certo.exception;


public class ApiErrors {

    private final String errors;

    public ApiErrors(String mensagemErro) {
        this.errors = mensagemErro;
    }


    public String getErrors() {
        return errors;
    }
}
