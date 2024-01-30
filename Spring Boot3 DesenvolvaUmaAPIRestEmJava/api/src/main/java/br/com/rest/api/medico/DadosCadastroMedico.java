package br.com.rest.api.medico;

import br.com.rest.api.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroMedico(
		
		@NotBlank
		String nome,
		@NotBlank @Email
		String email, 
		@NotBlank
		String telefone,
		@NotBlank
		@Pattern(regexp = "\\d{4,6}")
		String crm, 
		@NotBlank
		Especialidade especialidade,
		@NotBlank @Valid
		DadosEndereco endereco) {

}
