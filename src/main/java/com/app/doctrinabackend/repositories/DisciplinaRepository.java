package com.app.doctrinabackend.repositories;

import com.app.doctrinabackend.domain.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository  extends JpaRepository<Disciplina, Integer> {
    //faz operacoes de acesso a dados

}