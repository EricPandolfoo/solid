package com.eric.solid.lsp.errado;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Retangulo {

    protected Double largura;
    protected Double altura;


    public Double getArea() {
        return this.largura * this.altura;
    }
}
