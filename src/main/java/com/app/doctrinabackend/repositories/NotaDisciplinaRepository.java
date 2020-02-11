package com.app.doctrinabackend.repositories;

import com.app.doctrinabackend.domain.NotaDisciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaDisciplinaRepository extends JpaRepository<NotaDisciplina, Integer>{
    //faz operacoes de acesso a dados

}
