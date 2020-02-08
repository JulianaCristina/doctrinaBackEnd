package com.app.doctrinabackend.repositories;

import com.app.doctrinabackend.domain.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer>{
    //faz operacoes de acesso a dados

}
