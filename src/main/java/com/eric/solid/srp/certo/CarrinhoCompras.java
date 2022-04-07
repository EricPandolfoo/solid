package com.eric.solid.srp.certo;

import com.eric.solid.srp.certo.exception.RegraNegocioException;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private final List<Item> items = new ArrayList<>();


    public boolean adicionarItem(Item item) {
        if (item.itemValido(item.getDescricao(), item.getValor())) {
           return this.items.add(item);
        }
        throw new RegraNegocioException("Item com descrição ou valor inválidos.");
    }

    public boolean validarCarrinho() {
        return this.items.isEmpty();
    }


    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "CarrinhoCompras{" +
                "items=" + items +
                '}';
    }
}
