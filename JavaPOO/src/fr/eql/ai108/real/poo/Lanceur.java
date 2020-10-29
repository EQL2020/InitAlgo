package fr.eql.ai108.real.poo;

public class Lanceur {

	public static void main(String[] args) {
		
		Chien ein = new Chien();
		Chien laika = 
				new Chien("Laïka", 9, 0.9f, 15.42f, "Berger", true, 'L');
		//System.out.println(laika.nom);
		System.out.println(laika.getNom());
		laika.setNom("Spot");
		System.out.println(laika.getNom());
	}

}
