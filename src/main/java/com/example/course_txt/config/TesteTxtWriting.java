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
   public void Banco(String s) {
        List<Banco> bancoList = bancoRepository.findAll();

        String path = ("C:\\Users\\joaor\\OneDrive\\Documents\\Curso de programação\\Curso de Java\\" +
                "2 - Curso Udemy Java 2\\17 - Trabalho de arquivo\\scratch_out.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
            for (Banco banco : bancoList) {
                bw.write(String.valueOf("CPF: " + banco.getCpf() + " "));
                bw.write("NOME: "+banco.getNome() + " ");
                bw.write("DATA: " + banco.getDataNascimento() + " ");
                bw.write("AGENCIA: " + banco.getAgencia() + " ");
                bw.write(String.valueOf ("CONTA: "+ banco.getConta()) + " ");
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
   }
}
