package com.eric.solid.isp.errado.dao;

import com.eric.solid.isp.errado.componentes.Log;
import com.eric.solid.isp.errado.componentes.Notificacao;
import com.eric.solid.isp.interfaces.ICadastro;

public class ContratoModel extends BD implements ICadastro {

    @Override
    public void salvar() {
        //logica
    }

    @Override
    public void registrarLog(Log log) {
        //logica
    }

    @Override
    public void enviarNotificacao(Notificacao notificacao) {
        //logica
    }
}
