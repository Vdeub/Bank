package bank.beans;

import java.util.List;

import javax.ejb.Remote;

import bank.entities.*;

@Remote
public interface GestionClientsRemote {
	
	Client ajouterClient(Client unClient);
	
	public List<Client> getListeClients();
	
	public void retirerClient(Client client);
	
	public Client findClient(String name);
	
	public void modifierClient(Client client) throws ClientInconnu;
}