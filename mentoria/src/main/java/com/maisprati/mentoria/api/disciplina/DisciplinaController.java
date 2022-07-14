package com.maisprati.mentoria.api.disciplina;

import com.maisprati.mentoria.domain.aluno.AlunoModel;
import com.maisprati.mentoria.service.aluno.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import com.maisprati.mentoria.domain.disciplina.DisciplinaModel;
import com.maisprati.mentoria.service.disciplina.DisciplinaService;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


public class DisciplinaController {


    private final DisciplinaService disciplinaService;

    public DisciplinaController(DisciplinaService disciplinaService) {
        this.disciplinaService = disciplinaService;
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<DisciplinaModel> obter(@PathVariable Long id) {
//        Optional<DisciplinaModel> disciplinaOptional = disciplinaService.obter(id);
//        if (disciplinaOptional.isPresent()) {
//            return ResponseEntity.ok(disciplinaOptional.get());
//        }
//        return ResponseEntity.noContent().build();
//    }

    @GetMapping("")
    public ResponseEntity<List<DisciplinaModel>> obter(@RequestParam String nome) {
        return ResponseEntity.ok(disciplinaService.obterPorNome(nome));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DisciplinaModel> atualizar(@PathVariable Long id,
                                                @RequestBody DisciplinaModel disciplinaInformado) {
        return ResponseEntity.ok(disciplinaService.atualizar(id, disciplinaInformado));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DisciplinaModel> excluir(@PathVariable Long id) {
        disciplinaService.excluir(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/")
    public ResponseEntity<DisciplinaModel> incluir(@RequestBody DisciplinaModel disciplinaInformado) {
        return ResponseEntity.status(HttpStatus.CREATED).body(disciplinaService.incluir(disciplinaInformado));
    }


}
