package com.app.doctrinabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.doctrinabackend.domain.Pergunta;

@Repository
public interface PerguntaRepository extends JpaRepository<Pergunta, Integer>{
    //faz operacoes de acesso a dados

}
