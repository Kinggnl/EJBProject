package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.Vehicule;

/**
 * Session Bean implementation class GestionVehicule
 */
@Stateless
@LocalBean
public class GestionVehicule implements GestionVehiculeRemote, GestionVehiculeLocal {
@PersistenceContext
private EntityManager GV;
    /**
     * Default constructor. 
     */
    public GestionVehicule() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Vehicule ajouterVehicule(Vehicule v) {
GV.persist(v);	
return v;
	}

	@Override
	public Vehicule getVehicule(String matricule) {
Vehicule v=GV.find(Vehicule.class, matricule)	;	
if(v==null) throw new RuntimeException("Véhicule introuvable");
	return v;
	}

	

    @Override
	public void supprimerVehicule(String matricule) {
    	Vehicule vr=GV.find(Vehicule.class, matricule);
    	if(vr==null) throw new RuntimeException("Véhicule introuvable");    	
   GV.remove(vr);		
	}

	@Override
	public void updateVehicule(Vehicule v) {
GV.merge(v);		
	}

	@Override
	public List<Vehicule> listVehicule() {
Query req=GV.createQuery("select v from Vehicule v ");
	return req.getResultList();
	}

	@Override
	public List<Vehicule> listVehiculeparService() {
Query req=GV.createQuery("select v from Vehicule v order by v.service");
return req.getResultList();

	}

}
