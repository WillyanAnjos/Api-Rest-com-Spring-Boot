package com.tutorial.rest.tutorialRest.repository;

import com.tutorial.rest.tutorialRest.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

//Interface para receber Métodos crud do JPA
public interface AlunoRepository extends JpaRepository <Aluno, Long> {
}
