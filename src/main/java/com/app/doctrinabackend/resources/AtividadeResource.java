package com.app.doctrinabackend.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.doctrinabackend.domain.Atividade;
import com.app.doctrinabackend.services.AtividadeService;

@RestController
@RequestMapping(value="/atividades")
public class AtividadeResource {

	@Autowired
	private AtividadeService service; //acessa o servico

	//lista todos as atividades
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Atividade> find(@PathVariable Integer id) {
		Atividade obj = service.find(id);
		return ResponseEntity.ok(obj);
	}
}
