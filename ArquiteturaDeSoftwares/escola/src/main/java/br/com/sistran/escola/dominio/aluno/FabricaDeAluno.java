package br.com.sistran.escola.dominio.aluno;

public class FabricaDeAluno {

	private Aluno aluno;
	
	public FabricaDeAluno comNomeCPFEmail(String cpf, String nome, String email) {
		this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
		return this;
	}
	
	public FabricaDeAluno comTelefone(String ddd, String numero) {
		this.aluno.adicionaTelefone(ddd, numero);
		return this;
	}
	
	public Aluno criar() {
		return this.aluno;
	}
	
//	public static void main(String[] args) {
//		FabricaDeAluno fabrica = new FabricaDeAluno();
//		fabrica.comNomeCPFEmail("", "", "")
//		.comTelefone("", "")
//		.comTelefone("", "")
//		.criar();
//	}
	
}
