package services;

import java.util.List;

import javax.ejb.Remote;

//import metier.Position;
import metier.entities.Vehicule;

@Remote
public interface GestionVehiculeRemote {
	public Vehicule ajouterVehicule(Vehicule v);
	public Vehicule getVehicule(String matricule);
    public void supprimerVehicule(String matricule);
	public void updateVehicule(Vehicule v);
	public List<Vehicule> listVehicule();
	//public Position getpostion(String matricule,date datepos);

}