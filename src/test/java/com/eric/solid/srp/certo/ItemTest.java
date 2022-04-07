package com.eric.solid.srp.certo;

import com.eric.solid.srp.certo.exception.RegraNegocioException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;

import static org.junit.Assert.*;

public class ItemTest {

    @Mock
    Item item;

    @Rule
    public ExpectedException exception = ExpectedException.none();


    @Test
    public void construirObjetoPadraoTest() {
        item = new Item();

        assertEquals("", item.getDescricao());
        assertEquals(0.0, item.getValor(), 0);
    }

    @Test
    public void itemValidoTest() {

        item = new Item("descricao", 100.0);

        boolean reultado = item.itemValido(item.getDescricao(), item.getValor());

        assertTrue(reultado);
        assertEquals(100.0, item.getValor(), 0.1);
    }

    @Test
    public void itemComDescricaoVaziaTest() {

        item = new Item("", 100.0);

        exception.expect(RegraNegocioException.class);
        exception.expectMessage("Item com descrição ou valor inválidos.");

        boolean reultado = item.itemValido(item.getDescricao(), item.getValor());

        assertFalse(reultado);
    }

    @Test
    public void itemComValorVazioTest() {

        item = new Item("descricao", 0.0);


        try {
            item.itemValido(item.getDescricao(), item.getValor());
        } catch (RegraNegocioException e) {
            assertEquals("Item com descrição ou valor inválidos.", e.getMessage());
        }
    }


}