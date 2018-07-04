package services;

import java.util.List;

import javax.ejb.Remote;

import metier.entities.Marque;

@Remote
public interface GestionMarqueRemote {
	public List<Marque> listMarque();
	public List<String> listNomMarque();

}
