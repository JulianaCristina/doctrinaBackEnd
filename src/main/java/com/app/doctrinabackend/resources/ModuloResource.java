package com.app.doctrinabackend.resources;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.doctrinabackend.domain.Administrador;
import com.app.doctrinabackend.domain.Disciplina;
import com.app.doctrinabackend.domain.Modulo;
import com.app.doctrinabackend.domain.enums.NivelDificuldade;
import com.app.doctrinabackend.domain.enums.Tag;
import com.app.doctrinabackend.services.ModuloService;

@RestController
@RequestMapping(value="/modulos")
public class ModuloResource {

	@Autowired
	private ModuloService service; //acessa o servico

	//lista todos os modulos
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Modulo obj = service.buscar(id);
		return ResponseEntity.ok(obj);
	}
}
