package POO;

// Par manque de temps, date d'inscription est en int

public class Etudiant extends Individu {
	private int dateInscription;
	private String niveauEtude;

	public Etudiant(String nom, String prenom, int identifiant, int dateInscription, String niveauEtude) {
		super(nom, prenom, identifiant);
		this.dateInscription = dateInscription;
		this.niveauEtude = niveauEtude;

	}

	public int getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(int dateInscription) {
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
