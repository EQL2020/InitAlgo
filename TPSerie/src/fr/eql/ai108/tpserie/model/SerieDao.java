package fr.eql.ai108.tpserie.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SerieDao {
	
	private File file = new File("serie.csv");
	
	private Serie stringToSerie(String ligne) {
		String[] infos = ligne.split(";");
		Serie serie = new Serie(infos[0], Integer.parseInt(infos[1]), 
				Integer.parseInt(infos[2]), infos[3], infos[4]);
		return serie;
	}
	
	public List<Serie> getAll(){	
		//Instancier une liste de série
		List<Serie> series = new ArrayList<Serie>();
		//Lire chacun des lignes du fichier CSV
		FileReader in = null;
		BufferedReader br = null;		
		try {
			in = new FileReader(file);
			br = new BufferedReader(in);
			String ligne = "";
			//Pour chacune de ces lignes, on instancie un objet série
			while((ligne = br.readLine()) != null) {
				Serie serie = stringToSerie(ligne);
				//On ajoute l'objet série à la liste
				series.add(serie);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		//On retourne la liste
		
		return series;
	}
}
