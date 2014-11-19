package bank.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import bank.beans.CompteInconnu;
import bank.entities.Compte;

/**
 * Session Bean implementation class GestionComptes
 */
@Stateless
public class GestionComptes implements GestionComptesRemote, GestionComptesLocal{
	
	@PersistenceContext
	EntityManager em;
	
    /**
     * Default constructor. 
     */
	
	public GestionComptes() {
        // TODO Auto-generated constructor stub
    }
    
    
	public Compte ajouterCompte(Compte c) {
		// TODO Auto-generated method stub
		em.persist(c);
		return c;
	}


	public void supprimerCompte(Compte c) {
		// TODO Auto-generated method stub
		c = em.find(Compte.class,c.getId());
		em.remove(c);
	}


	public void modifierCompte(Compte c) throws CompteInconnu {
		// TODO Auto-generated method stub
		//em.merge(l);
		Compte d = em.find(Compte.class,c.getId());
		if (d!=null) em.merge(c);
		else throw new CompteInconnu();
	}

}
