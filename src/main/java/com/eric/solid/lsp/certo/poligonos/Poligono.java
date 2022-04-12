package com.eric.solid.lsp.certo.poligonos;

public class Poligono {

    private Object forma;

    public Object getForma() {
        return forma;
    }

    public void setForma(Object forma) {
        this.forma = forma;
    }

}
    /* Não consigo fazer isso.. o certo seria fazer dessa forma.
    public Double getArea() {
        return this.getForma().getLargura() * this.getForma().altura;
    }
     */

