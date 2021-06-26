package com.tutorial.rest.tutorialRest.controller;

import com.tutorial.rest.tutorialRest.model.Aluno;
import com.tutorial.rest.tutorialRest.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Indica que o controlador está fornecendo um serviço Rest do tipo JSON
@RestController
@AllArgsConstructor
public class AlunoController {
    // Habilita a injeção de dependências
    @Autowired
    AlunoRepository repository;

    //Listar todos os Alunos
    @GetMapping("/aluno")
    public List<Aluno> getAll(){
        return repository.findAll();
    }

    //Inserir um novo Aluno
    @PostMapping("/aluno")
    public Aluno insertAluno(@RequestBody Aluno aluno){
        System.out.println("Novo aluno salvo");
        return repository.save(aluno);
    }

    //Deleta um Aluno
    @DeleteMapping("/aluno/{id}")
    public void deleteAluno (@PathVariable Long id){
        repository.deleteById(id);
    }

    //Listar por ID
    @GetMapping("/aluno/{id}")
    public Aluno getById(@PathVariable Long id){
        return repository.findById(id).get();
    }
}
