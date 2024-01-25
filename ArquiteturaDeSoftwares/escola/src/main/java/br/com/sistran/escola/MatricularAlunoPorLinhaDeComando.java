package br.com.sistran.escola;

import br.com.sistran.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.sistran.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.sistran.escola.infra.alunos.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {

	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.124.123-89";
		String email = "fulano@gamil.com";
	
		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
		matricular.executa(new MatricularAlunoDto(nome, cpf, email));
				
	}
}
