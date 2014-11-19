package bank.entities;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Compte
 *
 */
@Entity
public class Compte implements Serializable {

	/**
	 * 
	 */
	private double solde;
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;
	
	// Plusieurs Comptes pour un Client
	@ManyToOne
	private Client client;
	
	// Plusieurs Comptes pour une Banque
	@ManyToOne
	private Banque banque;
	
	public Compte() {
		super();
	}  
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Banque getBanque() {
		return banque;
	}

	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	public void depotArgent(double montant){
		//Si le montant est négatif, c'est un débit et non un dépot
		if(montant<0) retraitArgent(-1*montant);
		//SInon c'est un dépot !
		else solde = solde + montant;
	}
	
	public void retraitArgent(double montant){
		//Si le montant est négatif, c'est un dépot et non un débit
		if(montant<0) retraitArgent(-1*montant);
		else solde = solde - montant;
	}

}
