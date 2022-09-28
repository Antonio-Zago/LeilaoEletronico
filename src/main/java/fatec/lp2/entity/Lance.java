package fatec.lp2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Lance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLance;
	
	private Double valor;
	
	@ManyToOne
	@JoinColumn(name = "cpfCliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "idLeilao")
	private Leilao leilao;

	public Long getIdLance() {
		return idLance;
	}

	public void setIdLance(Long idLance) {
		this.idLance = idLance;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Leilao getLeilao() {
		return leilao;
	}

	public void setLeilao(Leilao leilao) {
		this.leilao = leilao;
	}
	
	
	
}
