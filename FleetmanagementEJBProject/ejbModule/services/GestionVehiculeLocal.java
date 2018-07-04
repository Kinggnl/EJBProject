package services;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Vehicule;

@Local
public interface GestionVehiculeLocal {
	public Vehicule ajouterVehicule(Vehicule v);
	public Vehicule getVehicule(String matricule);
    public void supprimerVehicule(String matricule);
	public void updateVehicule(Vehicule v);
	public List<Vehicule> listVehicule();
    public List<Vehicule> listVehiculeparService();
}
