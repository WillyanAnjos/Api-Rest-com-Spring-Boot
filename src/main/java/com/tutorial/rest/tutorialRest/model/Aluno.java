package com.tutorial.rest.tutorialRest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity// Mostra que é uma entidade para o spring
@Data// Gera pelo Lombok métodos get and set
@AllArgsConstructor//Gera o construtor
@NoArgsConstructor//Gera o construtor vazio
public class Aluno {
    @Id//Seta que o atributo id é um id primary key
    @GeneratedValue(strategy = GenerationType.AUTO)// Seta que o id será gerado automaticamente
    private Long id;

    private String nome;

    private String curso;
}
