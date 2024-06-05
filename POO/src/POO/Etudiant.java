package POO;

import java.util.Date;

public abstract class Etudiant extends Individu {
	public Date dateInscription;
	public String niveauEtude;

	public Etudiant(String nom, String prenom, int identifiant, Date dateInscription, String niveauEtude) {
		super(nom, prenom, identifiant);
		this.dateInscription = dateInscription;
		this.niveauEtude = niveauEtude;

	}

}
