package com.eric.solid.dip.errado;

public class Sms implements IMensagemToken {

    @Override
    public boolean enviar() {
        System.out.println("Email: Seu token é 888-222");
        return true;
    }
}
