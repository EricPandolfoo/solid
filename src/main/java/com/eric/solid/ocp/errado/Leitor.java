package com.eric.solid.ocp.errado;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class Leitor {

    private String diretorio;
    private String nomeArquivo;

    public Leitor(String diretorio, String nomeArquivo) {
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

    public void lerArquivo() {
        String caminho = this.diretorio + "\\" + this.nomeArquivo;

        Arquivo arquivo = new Arquivo();
        try {
            String[] extensao = caminho.split("\\.");
            if (Objects.equals(extensao[1], "xlsx")) {
                List<Pessoa> pessoas = arquivo.lerArquivoXLSX(caminho);
                pessoas.forEach(System.out::println);
            } else if (Objects.equals(extensao[1], "txt")) {
                List<Pessoa> pessoas = arquivo.lerArquivoTXT(caminho);
                pessoas.forEach(System.out::println);
            }
        } catch (IOException | InvalidFormatException e) {
            e.printStackTrace();
        }
    }
}
