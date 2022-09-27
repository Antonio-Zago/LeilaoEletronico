package fatec.lp2.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import fatec.lp2.entity.Imovel;
import fatec.lp2.service.ImovelService;

@Path("/api/imovel")
public class ImovelController {
	
	@Inject
	ImovelService service;
	
	
	@GET
	public List<Imovel> findAll(){
		List<Imovel> imoveis = new ArrayList<>();
		
		try {
			imoveis = service.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return imoveis;
	}
	
	@POST
	@Transactional
	public void addImovel(Imovel imovel) {
		service.addImovel(imovel);
	}
	
}
