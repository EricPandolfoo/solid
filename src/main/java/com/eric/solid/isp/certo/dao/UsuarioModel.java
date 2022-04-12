package com.eric.solid.isp.certo.dao;

import com.eric.solid.isp.certo.componentes.Log;
import com.eric.solid.isp.certo.componentes.Notificacao;
import com.eric.solid.isp.certo.interfaces.ICadastro;
import com.eric.solid.isp.certo.interfaces.ILog;
import com.eric.solid.isp.certo.interfaces.INotificacao;

public class UsuarioModel extends BD implements ICadastro, INotificacao, ILog {


    @Override
    public void salvar() {

    }

    @Override
    public void registrarLog(Log log) {

    }

    @Override
    public void enviarNotificacao(Notificacao notificacao) {

    }
}
