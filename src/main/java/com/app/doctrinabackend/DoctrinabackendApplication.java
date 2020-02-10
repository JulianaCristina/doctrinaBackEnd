package com.app.doctrinabackend;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.doctrinabackend.domain.Administrador;
import com.app.doctrinabackend.domain.Disciplina;
import com.app.doctrinabackend.domain.Professor;
import com.app.doctrinabackend.repositories.AdministradorRepository;
import com.app.doctrinabackend.repositories.AtividadeRepository;
import com.app.doctrinabackend.repositories.DisciplinaRepository;
import com.app.doctrinabackend.repositories.ModuloRepository;
import com.app.doctrinabackend.repositories.PerguntaRepository;
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
	
	@Autowired
	private AtividadeRepository atividadeRepository;
	
	@Autowired
	private PerguntaRepository perguntaRepository;
	
	
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
	
		//fazer instancia de modulo, mas nao sei fazer pq tem enum, olhar como ele fez a de cliente
		
		// como nao tem a de modulo, nao da pra fazer a de atividade
		
		professorRepository.saveAll(Arrays.asList(prof1, prof2));
		administradorRepository.saveAll(Arrays.asList(adm));
		disciplinaRepository.saveAll(Arrays.asList(disc1, disc2, disc3));
		
		
		//nao da pra adc a de pergunta pq atividade nao ta pronta
		// https://www.udemy.com/course/spring-boot-ionic/learn/lecture/8090550#questions no final
		//Pergunta p1 = new Pergunta(null, "que cor eh a agua?", "agua eh azul", "agua eh verde", "agua eh vermelha", "letra A", 5);
		//Pergunta p2 = new Pergunta(null, "pergunta dois", "teste um", "teste dois", "teste tres", "letra C", 10.5);

		
		
	}

}
