package br.com.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rest.api.medico.DadosCadastroMedico;
import br.com.rest.api.medico.DadosListagemMedico;
import br.com.rest.api.medico.Medico;
import br.com.rest.api.medico.MedicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

	//Mecânismo de ingeção de dependência
	@Autowired
	private MedicoRepository repository;
	
	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados) {
		repository.save(new Medico(dados));
	}
	
	@GetMapping
	public List<DadosListagemMedico> listar() {
		return repository.findAll().stream().map(DadosListagemMedico::new).toList();
	}
}
