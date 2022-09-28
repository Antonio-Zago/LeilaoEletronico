package fatec.lp2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Imovel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idImovel;
	
	@ManyToOne
	@JoinColumn(name = "idTipoImovel")
	private TipoImovel tipoImovel;
	
	@ManyToOne
	@JoinColumn(name = "idLeilao")
	private Leilao leilao;

	private String endereco;
	
	private String cidade;
	
	private String estado;
	
	private Double areaTerreno;
	
	private String descricao;
	
	
	
	public Leilao getLeilao() {
		return leilao;
	}

	public void setLeilao(Leilao leilao) {
		this.leilao = leilao;
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

	public Double getAreaTerreno() {
		return areaTerreno;
	}

	public void setAreaTerreno(Double areaTerreno) {
		this.areaTerreno = areaTerreno;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getIdImovel() {
		return idImovel;
	}

	public void setIdImovel(Long idImovel) {
		this.idImovel = idImovel;
	}

	public TipoImovel getTipoImovel() {
		return tipoImovel;
	}

	public void setTipoImovel(TipoImovel tipoImovel) {
		this.tipoImovel = tipoImovel;
	}
	
	

}
