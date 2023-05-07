package spring.data.jpa.app.service;

import java.util.List;

import spring.data.jpa.app.entity.AvaliacaoFisica;
import spring.data.jpa.app.entity.form.AvaliacaoFisicaForm;
import spring.data.jpa.app.entity.form.AvaliacaoFisicaUpdateForm;

public interface IAvaliacaoFisicaService {
	AvaliacaoFisica create(AvaliacaoFisicaForm form);

	AvaliacaoFisica get(Long id);

	List<AvaliacaoFisica> getAll();

	AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

	void delete(Long id);
}