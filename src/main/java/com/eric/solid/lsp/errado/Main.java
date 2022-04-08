package com.eric.solid.lsp.errado;

public class Main {

    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(5d);
        retangulo.setLargura(10d);

        Quadrado quadrado = new Quadrado();
        quadrado.setAltura(5d);

        //Isso aqui deveria fazer sentido programaticamente mas o resultado sairia errado.. pois não está de acordo com o princípio LSP.
        Retangulo retangulo2 = new Quadrado();
        retangulo2.setAltura(5d);
        retangulo2.setLargura(10d);

        System.out.println("RETANGULO: " + retangulo.getArea());;
        System.out.println("QUADRADO: " + quadrado.getArea());;
    }
}
