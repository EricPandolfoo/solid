package com.eric.solid.srp.errado.controller;

import com.eric.solid.srp.errado.model.CarrinhoCompra;
import com.eric.solid.srp.errado.service.Servico;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    private final Servico servico;

    public Controller(Servico servico) {
        this.servico = servico;
    }

    @GetMapping("/ok")
    @ResponseStatus(HttpStatus.OK)
    public CarrinhoCompra getOk() {
        return servico.metodoTest();
    }
}
