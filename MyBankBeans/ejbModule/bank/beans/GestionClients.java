package bank.beans;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import bank.entities.Client;

/**
 * Session Bean implementation class GestionClients
 */
@Stateless
public class GestionClients implements GestionClientsRemote, GestionClientsLocal {
	@PersistenceContext
	EntityManager em;

    /**
     * Default constructor. 
     */
    public GestionClients() {
        // TODO Auto-generated constructor stub
    }

	public Client ajouterClient(Client unClient) {
		// TODO Auto-generated method stub
		em.persist(unClient);
		return unClient;
	}

	public List<Client> getListeClients() {
		// TODO Auto-generated method stub
		return em.createQuery("Select c from Client c").getResultList();
	}

	public void retirerClient(Client client) {
		// TODO Auto-generated method stub
		client=em.find(Client.class,client.getId());
		em.remove(client);
	}

	public Client findClient(String name) {
		// TODO Auto-generated method stub
		return em.find(Client.class,name);
	}

	public void modifierClient(Client client) throws ClientInconnu {
		// TODO Auto-generated method stub
		client=em.find(Client.class,client.getId());
		if (client!=null)
		em.merge(client);
		else throw new ClientInconnu();
	}
}
