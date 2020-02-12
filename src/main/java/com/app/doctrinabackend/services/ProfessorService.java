package com.app.doctrinabackend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.doctrinabackend.domain.Professor;
import com.app.doctrinabackend.repositories.ProfessorRepository;
import com.app.doctrinabackend.services.exceptions.ObjectNotFoundException;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository repo; //o servico vai acessar o obj de acesso a dados que é o repository

    public Professor buscar(Integer id){
        Optional<Professor> obj = repo.findById(id); //o id existe retorna o objeto, se nao tiver ele retorna nulo
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Professor.class.getName()));
    }
    
    //insere um prof
    public Professor insert(Professor obj) {
    	obj.setId(null); //pra mostrar que tem que ser um objeto novo, nao cadastrado
    	return repo.save(obj);
    }
}
