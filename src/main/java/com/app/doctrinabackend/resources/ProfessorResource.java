package com.app.doctrinabackend.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.doctrinabackend.domain.Professor;
import com.app.doctrinabackend.services.ProfessorService;

@RestController
@RequestMapping(value="/profs")
public class ProfessorResource {

	@Autowired
	private ProfessorService service; //acessa o servico

	//lista todos os professores
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Professor obj = service.buscar(id);
		return ResponseEntity.ok(obj);
	}
}
