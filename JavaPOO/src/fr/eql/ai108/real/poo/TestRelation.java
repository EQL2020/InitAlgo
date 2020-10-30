package fr.eql.ai108.real.poo;

public class TestRelation {

	public static void main(String[] args) {
		Chien ein = new Chien("Ein", 8, 0.70f, 7.45f, "Welsh Corgi", true, 'E');
		Collier collierEin = new Collier("rouge", "cuir");
		ein.setCollier(collierEin);
		System.out.println("Ein possède un collier en " + ein.getCollier().getMatiere() 
				+ " de couleur " + ein.getCollier().getCouleur() + ".");

		Collier collierLaica = new Collier("jaune", "tissus");
		Chien laica = new Chien("Laïca", 12, 0.9f, 12.42f, "Berger Allemand",
				true, 'L', collierLaica);
		System.out.println("Laïca possède un collier en " + laica.getCollier().getMatiere()
		+ " de couleur " + laica.getCollier().getCouleur() + ".");
	}

}
