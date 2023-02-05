package com.example.course_txt.repositories;

import com.example.course_txt.entities.Banco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BancoRepository extends JpaRepository<Banco, Long> {
}
