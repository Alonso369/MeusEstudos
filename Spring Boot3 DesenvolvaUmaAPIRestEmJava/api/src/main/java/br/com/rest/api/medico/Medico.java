package br.com.rest.api.medico;
import br.com.rest.api.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "medicos")
@Entity(name = "Medico")
@Getter //Gerar todos os métodos Getters via anotações
@NoArgsConstructor //Gerar o contrutor padrão
@AllArgsConstructor //Gerrar o contruro com todos so argumentos
@EqualsAndHashCode(of = "id") // Gerar o método Equals e o Hashcode, passando por parâmetro o 
                               //Equal e hashCode emcima do Id e não de todos o elementos 
public class Medico {

	public Medico(DadosCadastroMedico dados) {
		this.nome = dados.nome();
		this.email = dados.email();
		this.telefone = dados.telefone();
		this.crm = dados.crm();
		this.endereco = new Endereco(dados.endereco());
		this.especialidade = dados.especialidade();
	}

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String telefone;
	private String crm;
	
	@Enumerated(EnumType.STRING)
	private Especialidade especialidade;

	@Embedded
	private Endereco endereco;
	
	
}
