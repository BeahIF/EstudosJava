package com.maisprati.mentoria.domain.aluno;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends CrudRepository<AlunoModel, Long> {

  List<AlunoModel> findAllByNomeContaining(String nome);

//  @Query("")
//  List<AlunoModel> findByFilipeQuery(String nome);
}
