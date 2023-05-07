package spring.data.jpa.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.data.jpa.app.entity.Aluno;
import spring.data.jpa.app.entity.Matricula;
import spring.data.jpa.app.entity.form.MatriculaForm;
import spring.data.jpa.app.repository.AlunoRepository;
import spring.data.jpa.app.repository.MatriculaRepository;
import spring.data.jpa.app.service.IMatriculaService;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private MatriculaRepository matriculaRepository;

	@Autowired
	private AlunoRepository alunoRepository;

	@Override
	public Matricula create(MatriculaForm form) {
		Matricula matricula = new Matricula();
		Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

		matricula.setAluno(aluno);

		return matriculaRepository.save(matricula);
	}

	@Override
	public Matricula get(Long id) {
		return matriculaRepository.findById(id).get();
	}

	@Override
	public List<Matricula> getAll(String bairro) {

		if (bairro == null) {
			return matriculaRepository.findAll();
		} else {
			return matriculaRepository.findAlunosMatriculadosBairro(bairro);
		}

	}

	@Override
	public void delete(Long id) {
	}

}