package services;

import java.util.List;

import javax.ejb.Remote;

import metier.entities.Service;

@Remote
public interface GestionServiceRemote {
	public Service ajouterService(Service s);
    public void supprimerService(Service s);
	public void updateService(Service s);
	public List<Service> listService();
}
