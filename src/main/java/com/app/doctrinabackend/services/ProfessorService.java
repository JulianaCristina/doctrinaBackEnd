package com.app.doctrinabackend.services;

import com.app.doctrinabackend.domain.Professor;
import com.app.doctrinabackend.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository repo; //o servico vai acessar o obj de acesso a dados que é o repository

    public Professor buscar(Integer id){
        Optional<Professor> obj = repo.findById(id);
        return obj.orElse(null);
    }
}
