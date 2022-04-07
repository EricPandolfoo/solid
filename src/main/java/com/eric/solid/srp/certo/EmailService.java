package com.eric.solid.srp.certo;

public class EmailService {

    private String de;
    private String para;
    private String assunto;
    private String conteudo;


    public EmailService() {
        this.de = "contato@site.com.br";
        this.para = "";
        this.assunto = "";
        this.conteudo = "";
    }

    public EmailService(String de, String para, String assunto, String conteudo) {
        this.de = de;
        this.para = para;
        this.assunto = assunto;
        this.conteudo = conteudo;
    }

    public static String dispararEmail() {
        return "----envia e-mail----";
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
