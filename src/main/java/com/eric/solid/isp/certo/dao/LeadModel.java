package com.eric.solid.isp.certo.dao;

import com.eric.solid.isp.certo.componentes.Log;
import com.eric.solid.isp.certo.componentes.Notificacao;
import com.eric.solid.isp.certo.interfaces.ICadastro;
import com.eric.solid.isp.certo.interfaces.INotificacao;

public class LeadModel extends BD  implements ICadastro, INotificacao {

    @Override
    public void salvar() {

    }

    @Override
    public void enviarNotificacao(Notificacao notificacao) {

    }
}
