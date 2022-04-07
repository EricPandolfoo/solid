package com.eric.solid.ocp.errado;

public class PessoaBuilder {

    private Pessoa pessoa;
    private String nome;
    private String cpf;
    private String email;

    public PessoaBuilder() {
        this.pessoa = new Pessoa();
    }

    public static PessoaBuilder builder() {
        return new PessoaBuilder();
    }

    public PessoaBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public PessoaBuilder cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public PessoaBuilder email(String email) {
        this.email = email;
        return this;
    }

    public Pessoa build() {
        this.pessoa.setCpf(this.cpf);
        this.pessoa.setNome(this.nome);
        this.pessoa.setEmail(this.email);
        return this.pessoa;
    }

}
