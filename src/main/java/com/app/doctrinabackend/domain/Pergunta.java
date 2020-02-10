package com.app.doctrinabackend.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pergunta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String pergunta;
	private String respA;
	private String respB;
	private String respC;
	private String respCorreta;
	private double pontosPergunta;
	
	public Pergunta() {
	}

	public Pergunta(Integer id, String pergunta, String respA, String respB, String respC, String respCorreta,
			double pontosPergunta) {
		super();
		this.id = id;
		this.pergunta = pergunta;
		this.respA = respA;
		this.respB = respB;
		this.respC = respC;
		this.respCorreta = respCorreta;
		this.pontosPergunta = pontosPergunta;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getRespA() {
		return respA;
	}

	public void setRespA(String respA) {
		this.respA = respA;
	}

	public String getRespB() {
		return respB;
	}

	public void setRespB(String respB) {
		this.respB = respB;
	}

	public String getRespC() {
		return respC;
	}

	public void setRespC(String respC) {
		this.respC = respC;
	}

	public String getRespCorreta() {
		return respCorreta;
	}

	public void setRespCorreta(String respCorreta) {
		this.respCorreta = respCorreta;
	}

	public double getPontosPergunta() {
		return pontosPergunta;
	}

	public void setPontosPergunta(double pontosPergunta) {
		this.pontosPergunta = pontosPergunta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pergunta other = (Pergunta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
