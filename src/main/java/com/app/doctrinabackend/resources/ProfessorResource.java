package com.app.doctrinabackend.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.doctrinabackend.domain.Professor;

@RestController
@RequestMapping(value="/profs")
public class ProfessorResource {

	//lista todos os professores
	@RequestMapping(method=RequestMethod.GET)
	public List<Professor> listar() {
		Professor p1 = new Professor(1, "Danielli", "dani@gmail.com", "iftm", "foto dani");
		Professor p2 = new Professor(2, "Tamara", "tamara@gmail.com", "eeja", "foto tamara");
	
		List<Professor> listaprof = new ArrayList<>();
		listaprof.add(p1);
		listaprof.add(p2);
		
		return listaprof;
	}
}
