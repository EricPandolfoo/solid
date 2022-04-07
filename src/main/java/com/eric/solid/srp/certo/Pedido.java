package com.eric.solid.srp.certo;

public class Pedido {

    private CarrinhoCompras carrinhoCompras;
    private String statusPedido;
    private Double valorPedido;


    public Pedido() {
        this.carrinhoCompras = new CarrinhoCompras();
        this.statusPedido = "aberto";
        this.valorPedido = 0.0;
    }

    public Pedido(CarrinhoCompras carrinhoCompras, String statusPedido, Double valorPedido) {
        this.carrinhoCompras = carrinhoCompras;
        this.statusPedido = statusPedido;
        this.valorPedido = valorPedido;
    }

    public boolean confimarPedido() {
        if (!this.carrinhoCompras.validarCarrinho()) {
            this.setStatusPedido("confirmado");
            return true;
        }
        return false;
    }

    public CarrinhoCompras getCarrinhoCompra() {
        return carrinhoCompras;
    }

    public void setCarrinhoCompra(CarrinhoCompras carrinhoCompras) {
        this.carrinhoCompras = carrinhoCompras;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }

    public Double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(Double valorPedido) {
        this.valorPedido = valorPedido;
    }
}
