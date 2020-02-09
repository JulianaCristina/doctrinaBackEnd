package com.app.doctrinabackend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.doctrinabackend.domain.Disciplina;
import com.app.doctrinabackend.repositories.DisciplinaRepository;
import com.app.doctrinabackend.services.exceptions.ObjectNotFoundException;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository repo; //o servico vai acessar o obj de acesso a dados que é o repository

    public Disciplina buscar(Integer id){
        Optional<Disciplina> obj = repo.findById(id); //o id existe retorna o objeto, se nao tiver ele retorna nulo
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Disciplina.class.getName()));
    }
}
