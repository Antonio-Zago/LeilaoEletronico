package fatec.lp2.repository;

import javax.enterprise.context.ApplicationScoped;

import fatec.lp2.entity.Imovel;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class ImovelRepository implements PanacheRepository<Imovel>{

}
