package com.app.doctrinabackend;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.doctrinabackend.domain.Administrador;
import com.app.doctrinabackend.domain.Disciplina;
import com.app.doctrinabackend.domain.Modulo;
import com.app.doctrinabackend.domain.Professor;
import com.app.doctrinabackend.domain.enums.Tag;
import com.app.doctrinabackend.repositories.AdministradorRepository;
import com.app.doctrinabackend.repositories.DisciplinaRepository;
import com.app.doctrinabackend.repositories.ModuloRepository;
import com.app.doctrinabackend.repositories.ProfessorRepository;

@SpringBootApplication
public class DoctrinabackendApplication implements CommandLineRunner {

	@Autowired
	private ProfessorRepository professorRepository;
	
	@Autowired
	private AdministradorRepository administradorRepository;
	
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	@Autowired
	private ModuloRepository moduloRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DoctrinabackendApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Administrador adm = new Administrador(1, "admin", "admin@gmail.com", "foto aqui");
		
		Professor prof1 = new Professor(null,"danielli","dani@gmail.com", "iftm","ft dani");
		Professor prof2 = new Professor(null,"tâmara","tamara@gmail.com", "people","ft tâmara");
		
		Disciplina disc1 = new Disciplina(null, "TCC", "foto da disciplina", prof1);
		Disciplina disc2 = new Disciplina(null, "IA", "foto de IA", prof1);
		Disciplina disc3 = new Disciplina(null, "BD", "foto de BD", prof2);
				
		professorRepository.saveAll(Arrays.asList(prof1, prof2));
		administradorRepository.saveAll(Arrays.asList(adm));
		disciplinaRepository.saveAll(Arrays.asList(disc1, disc2, disc3));
	}

}
