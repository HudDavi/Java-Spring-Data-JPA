package spring.data.jpa.app.controller;

import java.util.List;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spring.data.jpa.app.entity.Matricula;
import spring.data.jpa.app.entity.form.MatriculaForm;
import spring.data.jpa.app.service.impl.MatriculaServiceImpl;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

	@Autowired
	private MatriculaServiceImpl service;

	@PostMapping
	public Matricula create(@Valid @RequestBody MatriculaForm form) {
		return service.create(form);
	}

	@GetMapping
	public List<Matricula> getAll(@RequestParam(required = false) String bairro) {
		return service.getAll(bairro);
	}
}