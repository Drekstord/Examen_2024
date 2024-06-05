package POO;

import java.util.Date;

public class Etudiant extends Individu {
	private Date dateInscription;
	private String niveauEtude;

	public Etudiant(String nom, String prenom, int identifiant, Date dateInscription, String niveauEtude) {
		super(nom, prenom, identifiant);
		this.dateInscription = dateInscription;
		this.niveauEtude = niveauEtude;

	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public String getNiveauEtude() {
		return niveauEtude;
	}

	public void setNiveauEtude(String niveauEtude) {
		this.niveauEtude = niveauEtude;
	}

	public void montrerDetails() {
		System.out.println("Le nom de l'élève est : " + getNom());
		System.out.println("Le prénom de l'élève est : " + getPrenom());
		System.out.println("L'identifiant de l'élève est : " + getIdentifiant());
		System.out.println("La date d'inscription de l'élève est : " + getDateInscription());
		System.out.println("Le niveau d'étude de l'élève est : " + getNiveauEtude());
	}
}
