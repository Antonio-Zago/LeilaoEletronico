package fatec.lp2.dto;


public class ImovelDto {
	
	public ImovelDto(Long idImovel, String tipoImovel, String dominioLeilao, String enderecoLeilao, String cidadeLeilao,String estadoLeilao, String endereco,String cidade, String estado, Double areaTerreno, String descricao ) {
		this.idImovel = idImovel;
		this.tipoImovel = tipoImovel;
		this.dominioLeilao = dominioLeilao;
		this.cidadeLeilao = cidadeLeilao;
		this.estadoLeilao = estadoLeilao;
		this.enderecoLeilao = enderecoLeilao;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.areaTerreno = areaTerreno;
		this.descricao = descricao;
	}

	private Long idImovel;
	
	private String tipoImovel;
	
	private String dominioLeilao;
	
	private String enderecoLeilao;
	
	private String cidadeLeilao;
	
	private String estadoLeilao;

	private String endereco;
	
	private String cidade;
	
	private String estado;
	
	private Double areaTerreno;
	
	private String descricao;

	public Long getIdImovel() {
		return idImovel;
	}

	public void setIdImovel(Long idImovel) {
		this.idImovel = idImovel;
	}

	public String getTipoImovel() {
		return tipoImovel;
	}

	public void setTipoImovel(String tipoImovel) {
		this.tipoImovel = tipoImovel;
	}

	public String getDominioLeilao() {
		return dominioLeilao;
	}

	public void setDominioLeilao(String dominioLeilao) {
		this.dominioLeilao = dominioLeilao;
	}

	public String getEnderecoLeilao() {
		return enderecoLeilao;
	}

	public void setEnderecoLeilao(String enderecoLeilao) {
		this.enderecoLeilao = enderecoLeilao;
	}

	public String getCidadeLeilao() {
		return cidadeLeilao;
	}

	public void setCidadeLeilao(String cidadeLeilao) {
		this.cidadeLeilao = cidadeLeilao;
	}

	public String getEstadoLeilao() {
		return estadoLeilao;
	}

	public void setEstadoLeilao(String estadoLeilao) {
		this.estadoLeilao = estadoLeilao;
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
	
	
}
