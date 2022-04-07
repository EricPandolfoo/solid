package com.eric.solid.ocp.certo;

import com.eric.solid.ocp.errado.Pessoa;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Leitor1 {

    private String diretorio;
    private String nomeArquivo;

    public Leitor1(String diretorio, String nomeArquivo) {
        this.diretorio = diretorio;
        this.nomeArquivo = nomeArquivo;
    }


    public String getDiretorio() {
        return diretorio;
    }

    public void setDiretorio(String diretorio) {
        this.diretorio = diretorio;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @SneakyThrows
    public void lerArquivo() {

        String caminho = this.diretorio + "\\" + this.nomeArquivo;
        String[] extensao = caminho.split("\\.") ;

        String path = "com.eric.solid.ocp.certo.extrator.";
        String className = extensao[1].toUpperCase().charAt(0) + extensao[1].substring(1);

        //Definindo a classe que irá instanciar de acordo com a extensão do arquivo
        Class<?> classInvoked = Class.forName(path + className);
        Object objectToInvokeOn = classInvoked.newInstance();

        //Definindo e chamando o método que irá chamar assim como o parâmetro
        Method method = classInvoked.getDeclaredMethod("lerArquivo", String.class);
        Object retorno = method.invoke(objectToInvokeOn, caminho);

        //Acho que ficou meio bosta isso.. mas para fins de estudo está valendo
        List<Pessoa> pessoas = (ArrayList<Pessoa>) retorno;
        pessoas.forEach(System.out::println);
    }

}
