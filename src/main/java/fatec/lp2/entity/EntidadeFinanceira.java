package fatec.lp2.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class EntidadeFinanceira {
	

	
	@Id
	private String cnpjEntidadeFinanceira;
	
	private String nome;
	
	private String agencia;
	
	private String conta;
	
	
	@OneToMany(mappedBy = "entidadeFinanceira")
	private List<Leilao> leiloes;





	public String getCnpjEntidadeFinanceira() {
		return cnpjEntidadeFinanceira;
	}


	public void setCnpjEntidadeFinanceira(String cnpjEntidadeFinanceira) {
		this.cnpjEntidadeFinanceira = cnpjEntidadeFinanceira;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getAgencia() {
		return agencia;
	}


	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}


	public String getConta() {
		return conta;
	}


	public void setConta(String conta) {
		this.conta = conta;
	}


	public List<Leilao> getLeiloes() {
		return leiloes;
	}


	public void setLeiloes(List<Leilao> leiloes) {
		this.leiloes = leiloes;
	}
	
	

}
