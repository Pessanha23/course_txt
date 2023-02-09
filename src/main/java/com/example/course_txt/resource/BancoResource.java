package com.example.course_txt.resource;

import com.example.course_txt.config.TesteTxtReading;
import com.example.course_txt.config.TesteTxtWriting;
import com.example.course_txt.entities.Banco;
import com.example.course_txt.repositories.BancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/banco")
public class BancoResource {

    @Autowired
    public TesteTxtWriting testeTxtWriting;

    @PostMapping
    public ResponseEntity txtWritingResponseEntity(){
        testeTxtWriting.banco();
        return ResponseEntity.ok().build();
    }
}
