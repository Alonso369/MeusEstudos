package br.com.rest.api.medico;

public record DadosListagemMedico(String nome, String email, String crm, String especialidade) {

	public DadosListagemMedico(Medico medico) {
		this(nome, email, crm, especialidade);
	}
}
