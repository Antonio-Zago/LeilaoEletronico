package fatec.lp2.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import fatec.lp2.dto.ImovelDto;
import fatec.lp2.entity.Imovel;
import fatec.lp2.service.ImovelService;

@Path("/api/imovel")
public class ImovelController {
	
	@Inject
	ImovelService service;
	
	
	@GET
	public List<ImovelDto> findAll(){
		List<Imovel> imoveis = new ArrayList<>();
		List<ImovelDto> imoveisDto = new ArrayList<>();
		
		try {
			imoveis = service.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (Imovel imovel : imoveis) {
			ImovelDto imovelDto = new ImovelDto(imovel.getIdImovel(), 
												imovel.getTipoImovel().getNome(),
												imovel.getLeilao().getDominio(),
												imovel.getLeilao().getCidade(),
												imovel.getLeilao().getEstado(),
												imovel.getLeilao().getEndereco(),
												imovel.getEndereco(), 
												imovel.getCidade(),
												imovel.getEstado(),
												imovel.getAreaTerreno(),
												imovel.getDescricao());
			imoveisDto.add(imovelDto);
			
		}
		
		
		
		return imoveisDto;
	}
	
	@POST
	@Transactional
	public void addImovel(Imovel imovel) {
		service.addImovel(imovel);
	}
	
}
