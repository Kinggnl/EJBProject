package metier.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Marque
 *
 */
@Entity

public class Marque implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idMarque;
	private String nomMarque;
	
	@OneToMany(cascade = CascadeType.ALL, 
	        mappedBy = "marque", orphanRemoval = true)
	    private List<Modele> modeles = new ArrayList<>();

	public List<Modele> getModeles() {
		return modeles;
	}
	public void setModeles(List<Modele> modeles) {
		this.modeles = modeles;
	}

	//private List<Modele> listModele=new ArrayList<Modele>();
	private static final long serialVersionUID = 1L;

	public Marque() {
		super();
	}   
	public int getIdMarque() {
		return this.idMarque;
	}

	public void setIdMarque(int idMarque) {
		this.idMarque = idMarque;
	}   
	public String getNomMarque() {
		return this.nomMarque;
	}

	public void setNomMarque(String nomMarque) {
		this.nomMarque = nomMarque;
	}

   
}
