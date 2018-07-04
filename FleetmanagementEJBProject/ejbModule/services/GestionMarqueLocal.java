package services;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Marque;

@Local
public interface GestionMarqueLocal {
	public List<Marque> listMarque();
	public List<String> listNomMarque();
}
