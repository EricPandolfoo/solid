package com.eric.solid.dip.certo.tipos;

import com.eric.solid.dip.certo.IMensagemTokenn;

public class Sms implements IMensagemTokenn {

    @Override
    public boolean enviar() {
        System.out.println("Sms: Seu token é 888-222");
        return true;
    }
}
