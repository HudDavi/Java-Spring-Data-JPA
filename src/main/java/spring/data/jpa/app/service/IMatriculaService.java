package spring.data.jpa.app.service;

import java.util.List;

import spring.data.jpa.app.entity.Matricula;
import spring.data.jpa.app.entity.form.MatriculaForm;

public interface IMatriculaService {
	Matricula create(MatriculaForm form);

	Matricula get(Long id);

	List<Matricula> getAll(String bairro);

	void delete(Long id);
}