package com.eric.solid.lsp.errado;

public class Quadrado extends Retangulo{

    @Override
    public void setLargura(Double largura) {
        super.setLargura(largura);
        super.setAltura(largura);
    }

    @Override
    public void setAltura(Double altura) {
        this.altura = altura;
        this.largura = altura;
    }
}
