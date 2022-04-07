package com.eric.solid.srp.certo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PedidoController {


    @GetMapping("/pedido")
    @ResponseStatus(HttpStatus.OK)
    public Pedido getOk() {

        Pedido pedido = new Pedido();
        Item item1 = new Item("", 1599.99);
        Item item2 = new Item("Notebook", 1999.99);

        pedido.getCarrinhoCompra().adicionarItem(item1);
        pedido.getCarrinhoCompra().adicionarItem(item2);

        double total = pedido.getCarrinhoCompra().getItems().stream().mapToDouble(Item::getValor).sum();
        System.out.println("Valor total do pedido = " + total);

        String validarCarrinho = pedido.getCarrinhoCompra().validarCarrinho() ? "inválido" : "válido";
        System.out.println(validarCarrinho);

        System.out.println(pedido.confimarPedido());

        System.out.println("Status: " + pedido.getStatusPedido());

        if (pedido.getStatusPedido().equals("confirmado")) {
            System.out.println(EmailService.dispararEmail());
        }

        return pedido;

    }
}
