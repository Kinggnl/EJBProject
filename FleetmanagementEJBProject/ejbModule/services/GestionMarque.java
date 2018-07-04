package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.Marque;

/**
 * Session Bean implementation class GestionMarque
 */
@Stateless
@LocalBean
public class GestionMarque implements GestionMarqueRemote, GestionMarqueLocal {
	@PersistenceContext
	private EntityManager GV;

    /**
     * Default constructor. 
     */
    public GestionMarque() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Marque> listMarque() {
		Query req=GV.createQuery("select m from Marque m ");
		return req.getResultList();
	}

	@Override
	public List<String> listNomMarque() {
		Query req1=GV.createQuery("select m.nomMarque from Marque m ");
		return req1.getResultList();
	}



}
