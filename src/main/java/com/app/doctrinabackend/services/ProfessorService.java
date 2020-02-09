package com.app.doctrinabackend.services;

import com.app.doctrinabackend.domain.Professor;
import com.app.doctrinabackend.repositories.ProfessorRepository;
import com.app.doctrinabackend.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository repo; //o servico vai acessar o obj de acesso a dados que é o repository

    public Professor buscar(Integer id){
        Optional<Professor> obj = repo.findById(id); //o id existe retorna o objeto, se nao tiver ele retorna nulo
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Professor.class.getName()));
    }
}
