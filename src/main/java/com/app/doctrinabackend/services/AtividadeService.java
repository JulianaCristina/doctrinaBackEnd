package com.app.doctrinabackend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.doctrinabackend.domain.Atividade;
import com.app.doctrinabackend.repositories.AtividadeRepository;
import com.app.doctrinabackend.services.exceptions.ObjectNotFoundException;


@Service
public class AtividadeService {

    @Autowired
    private AtividadeRepository repo; //o servico vai acessar o obj de acesso a dados que é o repository

    public Atividade find(Integer id){
        Optional<Atividade> obj = repo.findById(id); //o id existe retorna o objeto, se nao tiver ele retorna nulo
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Atividade.class.getName()));
    }
}
