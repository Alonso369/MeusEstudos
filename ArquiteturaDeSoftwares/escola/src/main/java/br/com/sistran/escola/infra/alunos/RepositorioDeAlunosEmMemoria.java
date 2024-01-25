package br.com.sistran.escola.infra.alunos;

import java.util.ArrayList;
import java.util.List;

import br.com.sistran.escola.dominio.aluno.Aluno;
import br.com.sistran.escola.dominio.aluno.AlunoNaoEncontrado;
import br.com.sistran.escola.dominio.aluno.CPF;
import br.com.sistran.escola.dominio.aluno.RepositorioDeAlunos;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos{

	private List<Aluno> matriculados = new ArrayList<>();
	
	@Override
	public void matricular(Aluno aluno) {
		this.matriculados.add(aluno);
	}

	@Override
	public Aluno buscarPorCPF(CPF cpf) {
		return this.matriculados.stream()
				.filter(a -> a.getCpf().equals(cpf.getCPF())).findFirst()
				.orElseThrow(() -> new AlunoNaoEncontrado(cpf));
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		return this.matriculados;
	}
 
	
}
