package com.example.course_txt.config;

import com.example.course_txt.entities.Banco;
import com.example.course_txt.repositories.BancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.io.*;
import java.util.List;

@Configuration
public class TesteTxtWriting {

    @Autowired
    private BancoRepository bancoRepository;

    //Metodo para escrever um txt com informações extraidas do banco de dados;
    public void banco() {
        List<Banco> bancoList = bancoRepository.findAll();

        String path = ("C:\\Users\\joaor\\OneDrive\\Documents\\Curso de programação\\Curso de Java\\" +
                "2 - Curso Udemy Java 2\\17 - Trabalho de arquivo\\scratch_out.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (Banco banco : bancoList) {
                bw.write(String.valueOf(banco.getCpf()));
                bw.write(String.format("%-50s",banco.getNome()));
                bw.write(banco.getDataNascimento());
                bw.write(banco.getAgencia());
                bw.write(String.valueOf(banco.getConta()));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
54424044033MATHEUS MARQUES                                   310819900001X12300678
23727393017JOAO DA SILVA SOUZA                               020119650032400000001
04234304085ANA MARIA BEZERRA DA SILVA SOUZA BENTO 16         140519721500000004326

54424044033MATHEUS MARQUES                                   310819900001X12300678
23727393017JOAO DA SILVA SOUZA                               020119650032400000001
04234304085ANA MARIA BEZERRA DA SILVA SOUZA BENTO 16         140519721500000004326

 */

