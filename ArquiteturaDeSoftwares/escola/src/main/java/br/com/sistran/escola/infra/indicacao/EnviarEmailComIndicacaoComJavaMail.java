package br.com.sistran.escola.infra.indicacao;

import br.com.sistran.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.sistran.escola.dominio.aluno.Aluno;

public class EnviarEmailComIndicacaoComJavaMail implements EnviarEmailIndicacao{

	@Override
	public void enviarPara(Aluno indicado) {
		//lógica de envio de email com a Lib Java Mail
		
	}

}
