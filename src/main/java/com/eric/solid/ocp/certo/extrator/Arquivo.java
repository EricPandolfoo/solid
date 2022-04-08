package com.eric.solid.ocp.certo.extrator;

import com.eric.solid.ocp.errado.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Arquivo {

    private final List<Pessoa> pessoas = new ArrayList<>();

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}
