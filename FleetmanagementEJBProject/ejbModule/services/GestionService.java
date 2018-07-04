package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.Service;

/**
 * Session Bean implementation class GestionService
 */
@Stateless
@LocalBean
public class GestionService implements GestionServiceRemote, GestionServiceLocal {

	@PersistenceContext
	private EntityManager GV;
    public GestionService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Service ajouterService(Service s) {
GV.persist(s);
return s ;
	}

	@Override
	public void supprimerService(Service s) {
GV.remove(s);		
	}

	@Override
	public void updateService(Service s) {
GV.merge(s);		
	}

	@Override
	public List<Service> listService() {
		Query req=GV.createQuery("select s from Service s ");
		return req.getResultList();
	}

	@Override
	public List<String> listnomService() {
Query req=GV.createQuery("select s.nomService from Service s");
return req.getResultList();
	}

}
