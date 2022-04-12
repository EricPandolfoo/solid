package com.eric.solid.dip.certo;

import com.eric.solid.dip.certo.tipos.Email;
import com.eric.solid.dip.certo.tipos.Sms;
import com.eric.solid.dip.certo.tipos.WhatsApp;

public class Main {

    public static void main(String[] args) {

        Mensageiros msg1 = new Mensageiros(new Email());
        msg1.enviarToken();

        Mensageiros msg2 = new Mensageiros(new Sms());
        msg2.enviarToken();

        Mensageiros msg3 = new Mensageiros(new WhatsApp());
        msg3.enviarToken();
    }
}
