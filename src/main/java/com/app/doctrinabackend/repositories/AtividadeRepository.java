package com.app.doctrinabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.doctrinabackend.domain.Atividade;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Integer>{
    //faz operacoes de acesso a dados

}
