package com.app.doctrinabackend.repositories;

import com.app.doctrinabackend.domain.Modulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuloRepository  extends JpaRepository<Modulo, Integer> {
    //faz operacoes de acesso a dados

}