package com.eric.solid.dip.certo.tipos;

import com.eric.solid.dip.certo.IMensagemTokenn;

public class Email implements IMensagemTokenn {

    @Override
    public boolean enviar() {
        System.out.println("Email: Seu token é 555-333");
        return true;
    }
}
