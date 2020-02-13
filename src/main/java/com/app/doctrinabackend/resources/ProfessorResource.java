package com.app.doctrinabackend.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.app.doctrinabackend.domain.Professor;
import com.app.doctrinabackend.dto.ProfessorDTO;
import com.app.doctrinabackend.services.ProfessorService;

@RestController
@RequestMapping(value = "/profs")
public class ProfessorResource {

	@Autowired
	private ProfessorService service; // acessa o servico

	// lista os professores por id
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Professor> find(@PathVariable Integer id) {
		Professor obj = service.find(id);
		return ResponseEntity.ok(obj);
	}

	// INSERIR
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Professor obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build(); // cria o codigo 201, que é o codigo de cadastro
	}

	// ATUALIZAR
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Professor obj, @PathVariable Integer id) {
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}

	// DELETAR
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

	// listar todos os professores
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ProfessorDTO>> findAll() {
		List<Professor> list = service.findAll();
		List<ProfessorDTO> listDto = list.stream().map(obj -> new ProfessorDTO(obj)).collect(Collectors.toList());  
		return ResponseEntity.ok(listDto);
	}
}
