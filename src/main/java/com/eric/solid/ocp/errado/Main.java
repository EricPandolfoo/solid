package com.eric.solid.ocp.errado;

public class Main  {

    public static void main(String[] args) {

        Leitor leitor = new Leitor("E:\\Java\\Solid\\arquivos", "dados.xlsx");
        Leitor leitor1 = new Leitor("E:\\Java\\Solid\\arquivos", "dados.txt");

        System.out.println("EXCEL");
        leitor.lerArquivo();
        System.out.println("TXT");
        leitor1.lerArquivo();
    }
}
