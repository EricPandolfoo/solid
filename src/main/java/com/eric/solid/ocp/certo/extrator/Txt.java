package com.eric.solid.ocp.certo.extrator;

import com.eric.solid.ocp.errado.Pessoa;
import com.eric.solid.ocp.errado.PessoaBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Txt extends Arquivo {


    public List<Pessoa> lerArquivo(String caminho) {
        List<Pessoa> pessoas = this.getPessoas();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(caminho));

            String line = bufferedReader.readLine();
            while (line != null) {

                String cpf = line.substring(0, 11).trim();
                String nome = line.substring(11, 30).trim();
                String email = line.substring(41).trim();

                Pessoa pessoa = PessoaBuilder.builder()
                        .nome(nome)
                        .email(email)
                        .cpf(cpf)
                        .build();

                pessoas.add(pessoa);

                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            System.out.println("TXT");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pessoas;
    }
}
