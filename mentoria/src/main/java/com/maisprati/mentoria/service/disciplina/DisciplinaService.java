package com.maisprati.mentoria.service.disciplina;

import com.maisprati.mentoria.domain.disciplina.DisciplinaModel;
import com.maisprati.mentoria.domain.disciplina.DisciplinaRepository;
import com.maisprati.mentoria.exception.MentoriaException;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class DisciplinaService {

  private final DisciplinaRepository disciplinaRepository;

  public DisciplinaService(DisciplinaRepository disciplinaRepository) {
    this.disciplinaRepository = disciplinaRepository;
  }

  public Optional<DisciplinaModel> obter(Long id) {
    return this.disciplinaRepository
        .findById(id);
  }

  public DisciplinaModel incluir(DisciplinaModel disciplinaInformado) {
    if(disciplinaInformado.getId() != null){
      throw new MentoriaException("Disciplina", "incluir");
    }
    return this.disciplinaRepository
        .save(disciplinaInformado);
  }


  public DisciplinaModel atualizar(Long id, DisciplinaModel disciplinaInformado) {
    DisciplinaModel disciplinaAtualizado = obter(id).orElseThrow(() -> new MentoriaException("disciplina", "atualizar", id));
    disciplinaAtualizado.setNome(disciplinaInformado.getNome());
    return this.disciplinaRepository.save(disciplinaAtualizado);
  }

  public void excluir(Long id) {
    this.disciplinaRepository.deleteById(id);
  }

  public List<DisciplinaModel> obterPorNome(String nome) {
    return this.disciplinaRepository
        .findAllByNomeContaining(nome);
  }
}
