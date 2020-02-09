package com.app.doctrinabackend;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.doctrinabackend.domain.Administrador;
import com.app.doctrinabackend.domain.Professor;
import com.app.doctrinabackend.repositories.AdministradorRepository;
import com.app.doctrinabackend.repositories.ProfessorRepository;

@SpringBootApplication
public class DoctrinabackendApplication implements CommandLineRunner {

	@Autowired
	private ProfessorRepository professorRepository;
	
	@Autowired
	private AdministradorRepository administradorRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DoctrinabackendApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Administrador adm = new Administrador(1, "admin", "admin@gmail.com", "foto aqui");
		
		Professor prof1 = new Professor(null,"danielli","dani@gmail.com", "iftm","ft dani");
		Professor prof2 = new Professor(null,"tâmara","tamara@gmail.com", "people","ft tâmara");
		
		/*Disciplina disc1 = new Disciplina(null, "poo","foto disciplina",1);
		Disciplina disc2 = new Disciplina(null, "esof","foto disciplina esof",2);
		
		//professor 1 ministra as seguintes disciplinas:
		 *
		*/
		professorRepository.saveAll(Arrays.asList(prof1, prof2));
		administradorRepository.saveAll(Arrays.asList(adm));
	}

}
