package com.app.doctrinabackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.app.doctrinabackend.domain.Professor;
import com.app.doctrinabackend.repositories.ProfessorRepository;
import com.app.doctrinabackend.services.exceptions.DataIntegrityException;
import com.app.doctrinabackend.services.exceptions.ObjectNotFoundException;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository repo; //o servico vai acessar o obj de acesso a dados que é o repository

    public Professor find(Integer id){
        Optional<Professor> obj = repo.findById(id); //o id existe retorna o objeto, se nao tiver ele retorna nulo
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Professor.class.getName()));
    }
    
    //INSERT
    public Professor insert(Professor obj) {
    	obj.setId(null); //pra mostrar que tem que ser um objeto novo, nao cadastrado
    	return repo.save(obj);
    }
    
    //ATUALIZAR
    public Professor update(Professor obj) {
    	find(obj.getId()); // o find já vê se o id existe e se não existir retorna uma excessao
    	return repo.save(obj); //se o id não for nulo insere
    }

    //DELETE
    public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir um Professor que ministre alguma Disciplina");
		}
	}  
    
    //LISTAR TODOS
    public List<Professor> findAll(){
    	return repo.findAll();
    }
    
}
