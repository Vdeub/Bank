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
	
	@OneToOne
	private Banque banque;
	
	@OneToMany
	private List<Compte> comptes = new ArrayList<Compte>();

}
