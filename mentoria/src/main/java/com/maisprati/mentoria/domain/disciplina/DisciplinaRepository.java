package com.maisprati.mentoria.domain.disciplina;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends CrudRepository<DisciplinaModel, Long> {

  List<DisciplinaModel> findAllByNomeContaining(String nome);

//  @Query("")
//  List<DisciplinaModel> findByFilipeQuery(String nome);
}
