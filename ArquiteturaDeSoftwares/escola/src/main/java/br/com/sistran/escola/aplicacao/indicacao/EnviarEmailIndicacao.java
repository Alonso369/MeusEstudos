package br.com.sistran.escola.aplicacao.indicacao;

import br.com.sistran.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

	void enviarPara(Aluno indicado);
}
