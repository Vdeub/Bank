package bank.beans;
import javax.ejb.Remote;

import bank.entities.Compte;

@Remote
public interface GestionComptesRemote {
	
	public Compte ajouterCompte(Compte c);
	
	public void supprimerCompte(Compte c);
	
	public void modifierCompte(Compte c) throws CompteInconnu;
}
