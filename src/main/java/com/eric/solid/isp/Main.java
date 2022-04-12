package com.eric.solid.isp;

import com.eric.solid.isp.errado.dao.ContratoModel;
import com.eric.solid.isp.errado.dao.LeadModel;
import com.eric.solid.isp.errado.dao.UsuarioModel;

public class Main {


    public static void main(String[] args) {

        ContratoModel contratoModel;
        LeadModel leadModel;
        UsuarioModel usuarioModel;

        contratoModel = new ContratoModel();
        leadModel = new LeadModel();
        usuarioModel = new UsuarioModel();

        System.out.println(contratoModel);
        System.out.println(leadModel);
        System.out.println(usuarioModel);

    }
}
