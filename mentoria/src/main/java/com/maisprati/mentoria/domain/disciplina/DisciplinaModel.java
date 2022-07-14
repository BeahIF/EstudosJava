package com.maisprati.mentoria.domain.disciplina;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "disciplina")
public class DisciplinaModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private String descricao;
  private LocalDate criadoEm;
  private LocalDate iniciaEm;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public LocalDate getCriadoEm() {
    return criadoEm;
  }

  public void setCriadoEm(LocalDate criadoEm) {
    this.criadoEm = criadoEm;
  }
  
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  
  public LocalDate getIniciaEm() {
    return iniciaEm;
  }

  public void setIniciaEm(LocalDate iniciaEm) {
    this.iniciaEm = iniciaEm;
  }


}
