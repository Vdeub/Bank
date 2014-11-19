package bank.entities;

import java.io.Serializable;

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
	
	@OneToMany
	private Banque banque;
	
	@OneToMany
	private Compte compte;

}
