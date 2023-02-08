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

    public void banco() {
        List<Banco> bancoList = bancoRepository.findAll();

        String path = ("C:\\Users\\joaor\\OneDrive\\Documents\\Curso de programação\\Curso de Java\\" +
                "2 - Curso Udemy Java 2\\17 - Trabalho de arquivo\\scratch_out.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            String cpfTamanho = "00000000000";
            String contaTamanho = "00000000";
            for (Banco banco : bancoList) {
                String cpfBanco = String.valueOf(banco.getCpf());
                for (int i = cpfBanco.length(); i < cpfTamanho.length(); i++) {
                    cpfBanco = "0".concat(cpfBanco);
                }

                String conta = String.valueOf(banco.getConta());
                for (int i = conta.length(); i < contaTamanho.length(); i++) {
                    conta = "0".concat(conta);
                }

                bw.write(cpfBanco);
                bw.write(String.format("%-50s",banco.getNome()));
                bw.write(banco.getDataNascimento());
                bw.write(banco.getAgencia());
                bw.write(conta);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
54424044033MATHEUS MARQUES                                   310819900001X 12300678
23727393017JOAO DA SILVA SOUZA                               0201196500324 00000001
04234304085ANA MARIA BEZERRA DA SILVA SOUZA BENTO 16         1405197215000 00004326

54424044033MATHEUS MARQUES                                   310819900001X12300678
23727393017JOAO DA SILVA SOUZA                               0201196500324_______1
_4234304085ANA MARIA BEZERRA DA SILVA SOUZA BENTO 16         1405197215000____4326

54424044033MATHEUS MARQUES                                   310819900001X12300678
23727393017JOAO DA SILVA SOUZA                               020119650032400000001
04234304085ANA MARIA BEZERRA DA SILVA SOUZA BENTO 16         140519721500000004326


 */

