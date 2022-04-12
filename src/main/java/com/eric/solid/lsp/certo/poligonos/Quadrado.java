package com.eric.solid.lsp.certo.poligonos;

public class Quadrado {

    protected Double largura;
    protected Double altura;


    public void setLargura(Double largura) {
        this.largura = largura;
        this.altura = largura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
        this.largura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public Double getAltura() {
        return altura;
    }

}
