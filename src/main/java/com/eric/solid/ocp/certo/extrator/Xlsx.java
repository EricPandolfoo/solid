package com.eric.solid.ocp.certo.extrator;

import com.eric.solid.ocp.errado.Pessoa;
import com.eric.solid.ocp.errado.PessoaBuilder;
import org.apache.commons.collections4.IteratorUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Xlsx extends Arquivo1 {


    public List<Pessoa> lerArquivo(String caminho) {

        List<Pessoa> pessoas = this.getPessoas();

        try {
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
            System.out.println("EXCEL");

        } catch (IOException | InvalidFormatException | EncryptedDocumentException e) {
            e.printStackTrace();
        }
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
}
