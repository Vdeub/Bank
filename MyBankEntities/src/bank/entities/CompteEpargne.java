package bank.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: LivreNumerique
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class CompteEpargne extends Compte implements Serializable {

	

	private static final long serialVersionUID = 1L;

	public CompteEpargne() {
		super();
	}  

   
}
