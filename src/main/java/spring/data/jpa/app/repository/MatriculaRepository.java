package spring.data.jpa.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import spring.data.jpa.app.entity.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
  @Query(value = "SELECT * FROM tb_matriculas m " +
      "INNER JOIN tb_alunos a ON m.aluno_id = a.id " +
      "WHERE a.bairro = :bairro", nativeQuery = true)
  List<Matricula> findAlunosMatriculadosBairro(String bairro);

  @Query("FROM Matricula m WHERE m.aluno.bairro = :bairro ")
  List<Matricula> findByAlunoBairro(String bairro);
}