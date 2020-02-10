package com.app.doctrinabackend.repositories;

import com.app.doctrinabackend.domain.Pergunta;
import com.app.doctrinabackend.domain.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerguntaRepository extends JpaRepository<Pergunta, Integer>{
    //faz operacoes de acesso a dados

}
