package com.app.doctrinabackend;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.doctrinabackend.domain.Administrador;
import com.app.doctrinabackend.domain.Disciplina;
import com.app.doctrinabackend.domain.Modulo;
import com.app.doctrinabackend.domain.Professor;
import com.app.doctrinabackend.domain.enums.NivelDificuldade;
import com.app.doctrinabackend.domain.enums.Tag;
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
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");

		Modulo mod1 = new Modulo(null, "Módulo 1 de IA", "descricao do modulo 1", "link video modulo 1", "link pdf do modulo 1", Tag.FEITO, 5.0, NivelDificuldade.FACIL, 2, sdf.parse("30/09/2017 10:32"), sdf.parse("30/02/2020 10:32"), disc1);
		Modulo mod2 = new Modulo(null, "Módulo 1 de BD", "descricao do modulo 1", "link video modulo 1", "link pdf do modulo 1", Tag.FEITO, 5.0, NivelDificuldade.FACIL, 2, sdf.parse("30/09/2017 10:32"), sdf.parse("30/02/2020 10:32"), disc2);
		Modulo mod3 = new Modulo(null, "Módulo 2 de BD", "descricao do modulo 2", "link video modulo 2", "link pdf do modulo 2", Tag.NAO_FEITO, 9.0, NivelDificuldade.MEDIO, 2, sdf.parse("30/09/2017 10:32"), sdf.parse("30/02/2020 10:32"), disc2);
/*
		Atividade atividade1 = new Atividade(null, 3, 2, 0.0, 10, "foto atividade 1", mod1);
		
		Pagamento pagto1 = new PagamentoComCartao(null, EstadoPagamento.QUITADO, ped1, 6);
		ped1.setPagamento(pagto1);

		Atividade atividade2 = new Atividade(null, 4, 3, 0.0, 8, "foto atividade 2", mod2);
		mod2.setPagamento(atividade2);
		
		Atividade atividade3 = new Atividade(null, 4, 3, 0.0, 8, "foto atividade 3", mod2);
		mod3.setPagamento(atividade3);

		disc1.get.addAll(Arrays.asList(mod1, mod2, mod3));

		moduloRepository.save(Arrays.asList(mod1, mod23, mod));
		atividadeRepository.save(Arrays.asList(pagto1, pagto2));
*/
		
		// como nao tem a de modulo, nao da pra fazer a de atividade
		
		professorRepository.saveAll(Arrays.asList(prof1, prof2));
		administradorRepository.saveAll(Arrays.asList(adm));
		disciplinaRepository.saveAll(Arrays.asList(disc1, disc2, disc3));
		moduloRepository.saveAll(Arrays.asList(mod1, mod2, mod3));

		
		
		//nao da pra adc a de pergunta pq atividade nao ta pronta
		// https://www.udemy.com/course/spring-boot-ionic/learn/lecture/8090550#questions no final
		//Pergunta p1 = new Pergunta(null, "que cor eh a agua?", "agua eh azul", "agua eh verde", "agua eh vermelha", "letra A", 5);
		//Pergunta p2 = new Pergunta(null, "pergunta dois", "teste um", "teste dois", "teste tres", "letra C", 10.5);
	
	}

}
