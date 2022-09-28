package fatec.lp2.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Leilao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLeilao;
	
	@ManyToOne
	@JoinColumn(name = "cnpjEntidadeFinanceira")
	private EntidadeFinanceira entidadeFinanceira;
	
	@OneToMany(mappedBy = "leilao")
	private List<Imovel> imoveis;
	
	@OneToMany(mappedBy = "leilao")
	private List<Veiculo> veiculos;
	
	@OneToMany(mappedBy = "leilao")
	private List<Lance> lances;
	
	private Date dataOcorrencia;
	
	private String dominio;
	
	private String endereco;
	
	private String cidade;
	
	private String estado;

	
	
	public List<Imovel> getImoveis() {
		return imoveis;
	}

	public void setImoveis(List<Imovel> imoveis) {
		this.imoveis = imoveis;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public List<Lance> getLances() {
		return lances;
	}

	public void setLances(List<Lance> lances) {
		this.lances = lances;
	}

	public Long getIdLeilao() {
		return idLeilao;
	}

	public void setIdLeilao(Long idLeilao) {
		this.idLeilao = idLeilao;
	}



	public EntidadeFinanceira getEntidadeFinanceira() {
		return entidadeFinanceira;
	}

	public void setEntidadeFinanceira(EntidadeFinanceira entidadeFinanceira) {
		this.entidadeFinanceira = entidadeFinanceira;
	}

	public Date getDataOcorrencia() {
		return dataOcorrencia;
	}

	public void setDataOcorrencia(Date dataOcorrencia) {
		this.dataOcorrencia = dataOcorrencia;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	

}
