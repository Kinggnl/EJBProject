package metier.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Vehicule
 *
 */
@Entity

public class Vehicule implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String matricule;
	private String carburant;
	private int numPuce;
	private Date date_M_E_C;
	private Date date_M_E_S;
	private int km_M_E_S;
	private int vitesseMax;
	private int km__Pr_Vidange;
	private int vidangechaque;
	private int km;
	private Date date_Assu;
	private Date date_Taxe;
	private Date date_visite_tec;

	/*public Modele getModele() {
		return modele;
	}

	public void setModele(Modele modele) {
		this.modele = modele;
	}
*/
	public int getVitesseMax() {
		return vitesseMax;
	}

	public void setVitesseMax(int vitesseMax) {
		this.vitesseMax = vitesseMax;
	}

	//

	@ManyToOne
	private Service service;

	
	public Vehicule() {
		super();
	}

public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public String getMatricule() {
		return this.matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public Date getDate_M_E_C() {
		return this.date_M_E_C;
	}

	public void setDate_M_E_C(Date date_M_E_C) {
		this.date_M_E_C = date_M_E_C;
	}

	public Date getDate_M_E_S() {
		return this.date_M_E_S;
	}

	public void setDate_M_E_S(Date date_M_E_S) {
		this.date_M_E_S = date_M_E_S;
	}

	public int getKm_M_E_S() {
		return this.km_M_E_S;
	}

	public void setKm_M_E_S(int km_M_E_S) {
		this.km_M_E_S = km_M_E_S;
	}

	public int getKm__Pr_Vidange() {
		return this.km__Pr_Vidange;
	}

	public void setKm__Pr_Vidange(int km__Pr_Vidange) {
		this.km__Pr_Vidange = km__Pr_Vidange;
	}

	public int getKm() {
		return this.km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public Date getDate_Assu() {
		return this.date_Assu;
	}

	public void setDate_Assu(Date date_Assu) {
		this.date_Assu = date_Assu;
	}

	public Date getDate_Taxe() {
		return this.date_Taxe;
	}

	public void setDate_Taxe(Date date_Taxe) {
		this.date_Taxe = date_Taxe;
	}

	public Date getDate_visite_tec() {
		return this.date_visite_tec;
	}

	public void setDate_visite_tec(Date date_visite_tec) {
		this.date_visite_tec = date_visite_tec;
	}

	public String getCarburant() {
		return carburant;
	}

	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}

	public int getNumPuce() {
		return numPuce;
	}

	public void setNumPuce(int numPuce) {
		this.numPuce = numPuce;
	}

	public int getVidangechaque() {
		return vidangechaque;
	}

	public void setVidangechaque(int vidangechaque) {
		this.vidangechaque = vidangechaque;
	}

}
