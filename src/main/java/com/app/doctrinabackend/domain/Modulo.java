package com.app.doctrinabackend.domain;

import com.app.doctrinabackend.domain.enums.NivelDificuldade;
import com.app.doctrinabackend.domain.enums.Tag;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class Modulo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;
    private String linkVideo;
    private String pdfMateria;
    private Tag tag;
    private double notaModulo;
    private Integer nivelDificuldade; //aqui no codigo vai ser armazenado como um inteiro, porem para o mundo externo a classe vai expor um dado NivelDificuldade
    private Integer feromonio;
    private Date dataReforco;
    private Date tempoSemReforco;

    // modulo tem 1 disciplina
    @ManyToOne
    @JoinColumn(name="disciplina_id")
    private Disciplina disciplina;

    public Modulo (){

    }

    public Modulo(Integer id, String nome, String descricao, String linkVideo, String pdfMateria, Tag tag, double notaModulo, NivelDificuldade nivelDificuldade, Integer feromonio, Date dataReforco, Date tempoSemReforco, Disciplina disciplina) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.linkVideo = linkVideo;
        this.pdfMateria = pdfMateria;
        this.tag = tag;
        this.notaModulo = notaModulo;
        this.nivelDificuldade = nivelDificuldade.getCod();
        this.feromonio = feromonio;
        this.dataReforco = dataReforco;
        this.tempoSemReforco = tempoSemReforco;
        this.disciplina = disciplina;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLinkVideo() {
        return linkVideo;
    }

    public void setLinkVideo(String linkVideo) {
        this.linkVideo = linkVideo;
    }

    public String getPdfMateria() {
        return pdfMateria;
    }

    public void setPdfMateria(String pdfMateria) {
        this.pdfMateria = pdfMateria;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public double getNotaModulo() {
        return notaModulo;
    }

    public void setNotaModulo(double notaModulo) {
        this.notaModulo = notaModulo;
    }

    public NivelDificuldade getNivelDificuldade() {
        return NivelDificuldade.ToEnum(nivelDificuldade);
    }

    public void setNivelDificuldade(NivelDificuldade nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade.getCod();
    }

    public Integer getFeromonio() {
        return feromonio;
    }

    public void setFeromonio(Integer feromonio) {
        this.feromonio = feromonio;
    }

    public Date getDataReforco() {
        return dataReforco;
    }

    public void setDataReforco(Date dataReforco) {
        this.dataReforco = dataReforco;
    }

    public Date getTempoSemReforco() {
        return tempoSemReforco;
    }

    public void setTempoSemReforco(Date tempoSemReforco) {
        this.tempoSemReforco = tempoSemReforco;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    // GERAR DNV O HASH CODE EQUALS
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Modulo)) return false;
        Modulo modulo = (Modulo) o;
        return id.equals(modulo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
