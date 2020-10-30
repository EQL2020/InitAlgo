package fr.eql.ai108.real.poo;

public class Chien {
	
	//VARIABLES D'INSTANCE
	private String nom;
	private int age;
	private float taille;
	private float poids;
	private String race;
	private boolean estGentil;
	private char pedigree;
	
	//CONSTRUCTEURS
	public Chien() {
	}
	
	public Chien(String nom, int age, float taille, float poids, String race, boolean estGentil, char pedigree) {
		this.nom = nom;
		this.age = age;
		this.taille = taille;
		this.poids = poids;
		this.race = race;
		this.estGentil = estGentil;
		this.pedigree = pedigree;
	}
	
	//METHODES D'INSTANCE
	public void aboyer() {
		System.out.println("Ouaf ouaf !!!");
	}
	
	public void ramenerLaBalle(int nbFois) {
		System.out.println("Je ramène " + nbFois + " la baballe");
	}
	
	public float rapportTaillePoids() {
		return taille/poids;
		
	}
	
	//ACCESSEURS ET MUTATEURS
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getTaille() {
		return taille;
	}

	public void setTaille(float taille) {
		this.taille = taille;
	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public boolean isEstGentil() {
		return estGentil;
	}

	public void setEstGentil(boolean estGentil) {
		this.estGentil = estGentil;
	}

	public char getPedigree() {
		return pedigree;
	}

	public void setPedigree(char pedigree) {
		this.pedigree = pedigree;
	}

}
