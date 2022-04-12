package com.eric.solid.dip.errado;

import lombok.SneakyThrows;

public class Main {


    @SneakyThrows
    public static void main(String[] args)  {


        Mensageiro msg1 = new Mensageiro();
        msg1.setCanal("Email");
        msg1.enviarToken();

        Mensageiro msg2 = new Mensageiro();
        msg2.setCanal("Sms");
        msg2.enviarToken();




    }
}
