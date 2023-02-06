package com.example.course_txt.config;

import com.example.course_txt.entities.Banco;
import com.example.course_txt.repositories.BancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@Configuration
public class TesteTxtReading implements CommandLineRunner{

    @Autowired
    private BancoRepository bancoRepository;
    //Metodo para Ler um txt e guardar as informações ocnfome a lógica no banco de dados;
    @Override
    public void run(String... args) throws Exception {
        File file = new File("C:\\Users\\joaor\\OneDrive\\Documents\\Curso de programação\\Curso de Java\\" +
                "2 - Curso Udemy Java 2\\17 - Trabalho de arquivo\\scratch_6.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while (line != null) {
                Banco banco = new Banco();

                System.out.println(line);
                Long bancoId = null;
                Long bancoCpf = Long.valueOf(line.substring(0, 11));
                banco.setCpf(bancoCpf);

                String nome = line.substring(11, 60);
                nome = nome.trim();
                banco.setNome(nome);

                String data = line.substring(61, 69);
                banco.setDataNascimento(data);

                String bancoAgencia = line.substring(69, 74);
                banco.setAgencia(bancoAgencia);

                Long bancoConta = Long.valueOf(line.substring(74, 82));
                banco.setConta(bancoConta);

                bancoRepository.save(banco);

                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("ERROR" + e.getMessage());
        }

    }
}
