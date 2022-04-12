package com.eric.solid.dip.certo;

import com.eric.solid.dip.errado.IMensagemToken;
import lombok.SneakyThrows;

public class Mensageiros {

    private static final String PATH = "com.eric.solid.dip.certo.tipos.";


    private IMensagemTokenn canal;

    public Mensageiros(IMensagemTokenn canal) {
        this.canal = canal;
    }

    public IMensagemTokenn getCanal() {
        return canal;
    }

    public void setCanal(IMensagemTokenn canal) {
        this.canal = canal;
    }


    @SneakyThrows
    public void enviarToken() {
        IMensagemTokenn className = this.canal;
        boolean enviar = className.enviar();
        System.out.println(enviar);

        /*
        //Definindo a classe que irá instanciar de acordo com a extensão do arquivo.. isso se chama reflection
        Class<?> classInvoked = Class.forName(PATH + className);
        Object objectToInvokeOn = classInvoked.newInstance();
        System.out.println(classInvoked.getName());

        //Definindo e chamando o método que irá chamar assim como o parâmetro
        Method method = classInvoked.getDeclaredMethod("enviar", null);
        Object retorno = method.invoke(objectToInvokeOn, null);
        System.out.println(retorno);
         */
    }
}
