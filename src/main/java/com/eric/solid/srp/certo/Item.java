package com.eric.solid.srp.certo;

import com.eric.solid.srp.certo.exception.RegraNegocioException;

public class Item {

    private String descricao;
    private Double valor;


    public Item(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public Item() {
        this.descricao = "";
        this.valor = 0.0;
    }


    public boolean itemValido(String descricao, Double valor) {
        if (!descricao.isEmpty() && valor > 0) return true;

        throw new RegraNegocioException("Item com descrição ou valor inválidos.");
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
