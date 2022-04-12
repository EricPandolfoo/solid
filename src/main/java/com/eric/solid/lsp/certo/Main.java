package com.eric.solid.lsp.certo;

import com.eric.solid.lsp.certo.poligonos.Poligono;
import com.eric.solid.lsp.certo.poligonos.Quadrado;
import com.eric.solid.lsp.certo.poligonos.Retangulo;

public class Main {

    public static void main(String[] args) {


        Poligono poligono = new Poligono();
        poligono.setForma(new Retangulo());
        ((Retangulo) poligono.getForma()).setLargura(5d);
        ((Retangulo) poligono.getForma()).setAltura(10d);
        /* Não consigo fazer isso.. o certo seria fazer assim
        System.out.println(poligono.getForma().getArea());
         */

        Poligono poligono1 = new Poligono();
        poligono1.setForma(new Quadrado());
        ((Quadrado) poligono1.getForma()).setAltura(5d);



        /*
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
         */
    }
}
