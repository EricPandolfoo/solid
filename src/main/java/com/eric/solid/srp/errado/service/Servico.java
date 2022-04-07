package com.eric.solid.srp.errado.service;

import com.eric.solid.srp.errado.model.CarrinhoCompra;
import org.springframework.stereotype.Service;

@Service
public class Servico {

    public CarrinhoCompra metodoTest() {
        CarrinhoCompra carrinhoCompra = new CarrinhoCompra();
        carrinhoCompra.adicionarItem("Bicicleta", 100.0);
        carrinhoCompra.adicionarItem("Geladeira", 1500.99);


        carrinhoCompra.setValorTotal(carrinhoCompra.retornaValorTotal(carrinhoCompra.getItens()));
        carrinhoCompra.exibirItens();
        carrinhoCompra.confirmarPedido(carrinhoCompra);
        carrinhoCompra.enviarEmailCofirmacao(carrinhoCompra);
        return carrinhoCompra;
    }
}
