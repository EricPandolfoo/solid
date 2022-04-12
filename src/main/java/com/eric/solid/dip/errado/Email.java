package com.eric.solid.dip.errado;

public class Email implements IMensagemToken {

    @Override
    public boolean enviar() {
        System.out.println("Email: Seu token é 555-333");
        return true;
    }
}
