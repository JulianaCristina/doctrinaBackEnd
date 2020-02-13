package com.app.doctrinabackend.dto;

import java.io.Serializable;

import com.app.doctrinabackend.domain.Professor;

public class ProfessorDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	//dados que eu quero para professor
	
	private Integer id;
	private String nome;
	private String email;
	//senha
	private String instituicao;
	private String foto;
	
	public ProfessorDTO() {
		
	}
	
	public ProfessorDTO(Professor obj) {
		id = obj.getId();
		nome = obj.getNome();
		email = obj.getEmail();
		instituicao = obj.getInstituicao();
		foto = obj.getFoto();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

}
