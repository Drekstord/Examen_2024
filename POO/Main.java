package poo

public abstract class Individu {
	private String nom;
	private String prenom;
	private int identifiant;
	
}

	public Individu(String nom, String prenom, int identifiant) {
		this.nom = nom;
		this.prenom = prenom;
		this.identifiant = identifiant;
	}


	public void montrerDetails()