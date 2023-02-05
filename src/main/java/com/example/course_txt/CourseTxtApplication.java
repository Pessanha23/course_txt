package com.example.course_txt;

import com.example.course_txt.repositories.BancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class CourseTxtApplication {


    public static void main(String[] args) {
        SpringApplication.run(CourseTxtApplication.class, args);
    }
}
