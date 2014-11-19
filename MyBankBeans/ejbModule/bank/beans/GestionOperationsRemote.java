package bank.beans;

import java.util.Vector;

import javax.ejb.Remote;

import bank.entities.Client;
import bank.entities.Compte;

@Remote
public interface GestionOperationsRemote {
	
public void choisirClient(Client c);
	
	public void ajouterCompte(Compte c);
	
	public void supprimerCompte(Compte c);
	
	public Vector<Compte> listerComptes();
	
	public void validerOperations();
	
	public void retournerOperations();
}
