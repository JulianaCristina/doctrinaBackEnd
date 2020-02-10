package com.app.doctrinabackend.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.doctrinabackend.domain.Pergunta;
import com.app.doctrinabackend.services.PerguntaService;

@RestController
@RequestMapping(value="/perguntas")
public class PerguntaResource {

	@Autowired
	private PerguntaService service; //acessa o servico

	//lista todas as perguntas
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Pergunta obj = service.buscar(id);
		return ResponseEntity.ok(obj);
	}
}
