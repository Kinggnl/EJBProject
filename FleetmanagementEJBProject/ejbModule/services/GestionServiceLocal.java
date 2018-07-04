package services;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Service;
import metier.entities.Vehicule;

@Local
public interface GestionServiceLocal {
	public Service ajouterService(Service s);
    public void supprimerService(Service s);
	public void updateService(Service s);
	public List<Service> listService();
	public List<String> listnomService();
}
