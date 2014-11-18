package bank.beans;

import java.util.List;

import javax.ejb.Remote;

import bank.entities.*;

@Remote
public interface GestionClientsRemote {
	
	Client ajouterLecteur(Client unClient);
	
	public List<Client> getListeLecteurs();
	
	public void retirerLecteur(Client lecteur);
	
	public Client findLecteur(String name);
	
	public void modifierLecteur(Client lecteur) throws ClientInconnu;
}