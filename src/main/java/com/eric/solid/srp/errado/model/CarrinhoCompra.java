package com.eric.solid.srp.errado.model;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {

    private String status;
    private Double valorTotal;
    private String emailConfirmacao;
    private List<Produto> itens;

    public CarrinhoCompra() {
        this.status = "aberto";
        this.valorTotal = 0.0;
        this.itens = new ArrayList<>();
    }

    public List<Produto> exibirItens() {
        return itens;
    }

    public void adicionarItem(String nome, Double valor) {
        Produto produto = new Produto(nome, valor);
        itens.add(produto);
    }

    public Double retornaValorTotal(List<Produto> itens) {
        double soma = 0;
        for (Produto produto : itens) {
            soma += produto.getValor();
        }
        return soma;
    }

    public void confirmarPedido(CarrinhoCompra carrinhoCompra) {
        if (!validarCarrinho(carrinhoCompra)) {
            carrinhoCompra.setStatus("Confirmado");
            return;
        }
        carrinhoCompra.setStatus("Sem Itens");
    }


    public void enviarEmailCofirmacao(CarrinhoCompra carrinhoCompra) {
        carrinhoCompra.setEmailConfirmacao("enviado");
    }

    public boolean validarCarrinho(CarrinhoCompra carrinhoCompra) {
        return carrinhoCompra.itens.isEmpty();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Produto> getItens() {
        return itens;
    }

    public void setItens(List<Produto> itens) {
        this.itens = itens;
    }

    public String getEmailConfirmacao() {
        return emailConfirmacao;
    }

    public void setEmailConfirmacao(String emailConfirmacao) {
        this.emailConfirmacao = emailConfirmacao;
    }
}
