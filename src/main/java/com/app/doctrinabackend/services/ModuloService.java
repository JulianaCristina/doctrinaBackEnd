package com.app.doctrinabackend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.doctrinabackend.domain.Modulo;
import com.app.doctrinabackend.repositories.ModuloRepository;


@Service
public class ModuloService {

    @Autowired
    private ModuloRepository repo; //o servico vai acessar o obj de acesso a dados que é o repository

    public Modulo buscar(Integer id){
        Optional<Modulo> obj = repo.findById(id);
        return obj.orElse(null);
    }
}
