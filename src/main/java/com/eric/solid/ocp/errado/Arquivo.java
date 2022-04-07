package com.eric.solid.ocp.errado;

import org.apache.commons.collections4.IteratorUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Arquivo {

    public List<Pessoa> lerArquivoXLSX(String caminho) throws IOException, InvalidFormatException {

        List<Pessoa> pessoas = new ArrayList<>();

        //The equivalent for .xlsx documents (Excel 2007+)
        XSSFWorkbook wb = new XSSFWorkbook(new File(caminho));
        //Also, if you want code that doesn't care whether it's an .xls or an .xlsx:
        Workbook workbook = WorkbookFactory.create(new File(caminho));


        //Definindo qual será a aba do excel que quero ler.
        Sheet sheet = workbook.getSheetAt(0);

        //Setando as linhas
        List<Row> rows = (List<Row>) toList(sheet.iterator());

        rows.forEach(row -> {

            //Setando as celulas
            List<Cell> cells = (List<Cell>) toList(row.cellIterator());

            //Deixar apenas números do cpf
            String cpfValidado = validaCpf(cells.get(1).getStringCellValue());

            //Atribuindo valores
            Pessoa pessoa = PessoaBuilder.builder()
                    .nome(cells.get(0).getStringCellValue())
                    .cpf(cpfValidado)
                    .email(cells.get(2).getStringCellValue())
                    .build();

            pessoas.add(pessoa);

        });

        workbook.close();
        return pessoas;
    }

    public List<?> toList(Iterator<?> iterator) {
        return IteratorUtils.toList(iterator);
    }

    private String validaCpf(String cpf) {

        String regex = "[0-9]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(cpf);

        StringBuilder resultado = new StringBuilder();
        while (m.find()) {
            resultado.append(m.group());
        }
        return resultado.toString().trim();

    }

    public List<Pessoa> lerArquivoTXT(String caminho) {
        List<Pessoa> pessoas = new ArrayList<>();
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
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pessoas;
    }
}
