package fatec.lp2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVeiculo;
	
	@ManyToOne
	@JoinColumn(name = "idTipoVeiculo")
	private TipoImovel tipoVeiculo;
	
	@ManyToOne
	@JoinColumn(name = "idLeilao")
	private Leilao leilao;

	private String modelo;
	
	private Integer ano;
	
	private String cor;
	
	private String combustivel;
	
	private Double rodagem;
	
	private String descricao;

	
	
	public Leilao getLeilao() {
		return leilao;
	}

	public void setLeilao(Leilao leilao) {
		this.leilao = leilao;
	}

	public Long getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(Long idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public TipoImovel getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(TipoImovel tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public Double getRodagem() {
		return rodagem;
	}

	public void setRodagem(Double rodagem) {
		this.rodagem = rodagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
