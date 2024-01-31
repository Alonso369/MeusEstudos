package br.com.alura.domain;

public class Pet {

	private Long id;
	private String tipo;
	private String nome;
	private String raca;
	private int idade;
	private String cor;
	private float peso;

	public Pet() {

	}

	public Pet(String tipo, String nome, String raca, int idade, String cor, float peso) {
		this.tipo = tipo;
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		this.cor = cor;
		this.peso = peso;
	}

	public String getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}

	public String getRaca() {
		return raca;
	}

	public int getIdade() {
		return idade;
	}

	public String getCor() {
		return cor;
	}

	public Long getId() {
		return id;
	}

}
