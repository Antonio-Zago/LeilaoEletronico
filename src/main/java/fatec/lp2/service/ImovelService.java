package fatec.lp2.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import fatec.lp2.entity.Imovel;
import fatec.lp2.repository.ImovelRepository;

@ApplicationScoped
public class ImovelService {
	
	@Inject
	ImovelRepository repository;
	
	public List<Imovel> findAll(){
		return repository.findAll().list();
	}
	
	public void addImovel(Imovel imovel) {
		repository.persist(imovel);
	}
}
