package bank.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: Banque
 *
 */
@Entity
public class Banque implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;
	
	// Une Banque a plusieurs Clients
	@OneToMany
	private List<Client> clients = new ArrayList<Client>();
	
	// Une Banque a plusieurs Comptes
	@OneToMany
	private List<Compte> comptes = new ArrayList<Compte>();
	
	
	public Banque() {
		super();
	}  
}
