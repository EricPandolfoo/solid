package com.eric.solid.isp.interfaces;

import com.eric.solid.isp.errado.componentes.Log;
import com.eric.solid.isp.errado.componentes.Notificacao;

public interface ICadastro {

    void salvar();
    void registrarLog(Log log);
    void enviarNotificacao(Notificacao notificacao);

}
