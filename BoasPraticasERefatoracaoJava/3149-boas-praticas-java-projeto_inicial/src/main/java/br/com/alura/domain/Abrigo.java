package br.com.alura.domain;

public class Abrigo {

	private Long id;
	private String nome;
	private String email;
	private String telefone;
	private Pet[] pets;

	public Abrigo() {

	}

	public Abrigo(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	public Pet[] getPets() {
		return pets;
	}
	
	@Override
	public String toString() {
	        return """
	                     "id":%s,"nome":"%s","telefone":"%s","email":"%s"
	                     """.formatted(this.id, this.nome, this.telefone, this.email);
	}


}
