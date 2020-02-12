package com.app.doctrinabackend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.doctrinabackend.domain.Pergunta;
import com.app.doctrinabackend.repositories.PerguntaRepository;
import com.app.doctrinabackend.services.exceptions.ObjectNotFoundException;


@Service
public class PerguntaService {

    @Autowired
    private PerguntaRepository repo; //o servico vai acessar o obj de acesso a dados que é o repository

    public Pergunta find(Integer id){
    	Optional<Pergunta> obj = repo.findById(id); //o id existe retorna o objeto, se nao tiver ele retorna nulo
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Pergunta.class.getName()));
    }
}
