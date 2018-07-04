package metier.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Modele
 *
 */
@Entity

public class Modele implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idModele;
	private String nomModele;
	@ManyToOne
	private Marque marque;
	private static final long serialVersionUID = 1L;
	/*
	@OneToMany(cascade = CascadeType.ALL, 
		        mappedBy = "modele", orphanRemoval = true)
	private List<Vehicule> vehicules = new ArrayList<>();*/
	public Modele() {
		super();
	}   
	public int getIdModele() {
		return this.idModele;
	}

	public void setIdModele(int idModele) {
		this.idModele = idModele;
	}   
	public String getNomModele() {
		return this.nomModele;
	}

	public void setNomModele(String nomModele) {
		this.nomModele = nomModele;
	}
	
	/*public Marque getMarque() {
		return marque;
	}
	public void setMarque(Marque marque) {
		this.marque = marque;
	}   
	*/
   
}
