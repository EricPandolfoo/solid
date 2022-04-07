package com.eric.solid.ocp.certo;

public class Main1 {

    public static void main(String[] args) {

        Leitor1 leitor = new Leitor1("E:\\Java\\Solid\\arquivos", "dados.xlsx");
        Leitor1 leitor1 = new Leitor1("E:\\Java\\Solid\\arquivos", "dados.txt");

        leitor.lerArquivo();
        leitor1.lerArquivo();
    }
}
