package metier.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Service
 *
 */
@Entity

public class Service implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idService;
	private String nomService;
	 /**
	 * 
	 */
	 @OneToMany(cascade = CascadeType.ALL, 
		        mappedBy = "service", orphanRemoval = true)
	private List<Vehicule> vehicules = new ArrayList<>();

	public Service(int idService, String nomService) {
		super();
		this.idService = idService;
		this.nomService = nomService;
	}
	public Service() {
		super();
	}   
	public List<Vehicule> getVehicules() {
		return vehicules;
	}
	private static final long serialVersionUID = 1L;

	public void setVehicules(List<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}
	public int getIdService() {
		return this.idService;
	}

	public void setIdService(int idService) {
		this.idService = idService;
	}   
	public String getNomService() {
		return this.nomService;
	}

	public void setNomService(String nomService) {
		this.nomService = nomService;
	}
   
}
