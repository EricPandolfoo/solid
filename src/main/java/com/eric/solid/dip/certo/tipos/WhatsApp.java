package com.eric.solid.dip.certo.tipos;

import com.eric.solid.dip.certo.IMensagemTokenn;

public class WhatsApp implements IMensagemTokenn {

    @Override
    public boolean enviar() {
        System.out.println("Whatsapp: Seu token é 999-222");
        return true;
    }
}
