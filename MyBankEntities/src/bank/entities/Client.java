package bank.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity
public class Client implements Serializable {

	/**
	 * 
	 */
	private String login;
	private String mdp;
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;
	
	// Un Client a une Banque
	@OneToOne
	private Banque banque;
	
	// Un client a plusieurs Comptes
	@OneToMany
	private List<Compte> comptes = new ArrayList<Compte>();

}
