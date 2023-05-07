package spring.data.jpa.app.service;

import java.util.List;

import spring.data.jpa.app.entity.Aluno;
import spring.data.jpa.app.entity.AvaliacaoFisica;
import spring.data.jpa.app.entity.form.AlunoForm;
import spring.data.jpa.app.entity.form.AlunoUpdateForm;

public interface IAlunoService {
	Aluno create(AlunoForm form);

	Aluno get(Long id);

	List<Aluno> getAll(String dataDeNascimento);

	Aluno update(Long id, AlunoUpdateForm formUpdate);

	void delete(Long id);

	List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}