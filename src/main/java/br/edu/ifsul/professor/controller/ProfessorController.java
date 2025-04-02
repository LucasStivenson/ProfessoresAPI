package br.edu.ifsul.professor.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsul.professor.model.Professor;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
    private List<Professor> professores = new ArrayList<>();

    @PostMapping
    public ResponseEntity<String> adicionarProfessor(@RequestBody Professor professor) {
        professores.add(professor);
        return ResponseEntity.status(HttpStatus.CREATED).body("Professor criado com sucesso!");
    }

    @GetMapping
    public ResponseEntity<List<Professor>> listarProfessores() {
        return ResponseEntity.ok(professores);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarProfessor(@PathVariable Long id) {
        for (Professor professor : professores) {
            if (professor.getId().equals(id)) {
                return ResponseEntity.ok(professor);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Professor não encontrado");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarProfessor(@PathVariable Long id, @RequestBody Professor professorAtualizado) {
        for(Professor professor : professores) {
            if (professor.getId().equals(id)) {
                professor.setNome(professorAtualizado.getNome());
                professor.setSalario(professorAtualizado.getSalario());
                return ResponseEntity.ok("Professor atualizado com sucesso!");
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Professor não encontrado");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> removerProfessor(@PathVariable Long id) {
        for (Professor professor : professores) {
            if (professor.getId().equals(id)) {
                professores.remove(professor);;
                return ResponseEntity.ok("Professor removido com sucesso!");
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Professor não encontrado");
    }
}
