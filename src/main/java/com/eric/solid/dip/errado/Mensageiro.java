package com.eric.solid.dip.errado;

import lombok.SneakyThrows;

import java.lang.reflect.Method;

public class Mensageiro {

    private static final String PATH = "com.eric.solid.dip.errado.";


    private String canal;

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }


    @SneakyThrows
    public void enviarToken() {
        String className = this.canal;

        //Definindo a classe que irá instanciar de acordo com a extensão do arquivo.. isso se chama reflection
        Class<?> classInvoked = Class.forName(PATH + className);
        Object objectToInvokeOn = classInvoked.newInstance();
        System.out.println(classInvoked.getName());

        //Definindo e chamando o método que irá chamar assim como o parâmetro
        Method method = classInvoked.getDeclaredMethod("enviar", null);
        Object retorno = method.invoke(objectToInvokeOn, null);
        System.out.println(retorno);
    }
}
