package bank.entities;

import java.io.Serializable;

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
	
	@ManyToOne
	private Client client;
	
	@OneToMany
	private Compte compte;
	
	
	public Banque() {
		super();
	}  
}
