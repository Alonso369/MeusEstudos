package br.com.sistran.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.sistran.escola.dominio.aluno.Email;

class EmailTest {

	@Test
	void naoDeveriaCriarEmailComEnderecosInvalidos() {
		assertThrows(IllegalArgumentException.class, 
				() -> new Email(null));
		
		assertThrows(IllegalArgumentException.class,
				() -> new Email(""));
		
		assertThrows(IllegalArgumentException.class,
				() -> new Email("email invalido"));
	}
	
	void deveriaCriarEmailComEnderecosValidos() {
		String endereco = "alonso@gamil.com";
		Email email = new Email(endereco);
		assertEquals(endereco, email.getEndereco());
	}
}
