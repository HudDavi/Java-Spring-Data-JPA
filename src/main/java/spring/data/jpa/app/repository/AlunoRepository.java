package spring.data.jpa.app.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.data.jpa.app.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
  List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);
}