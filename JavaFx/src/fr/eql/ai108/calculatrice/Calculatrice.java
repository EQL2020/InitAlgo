package fr.eql.ai108.calculatrice;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculatrice extends Application {
	
	//Tableau à deux dimensions qui contient l'affichage de mes boutons
	private String[][] buttons = {
			{"1", "2", "3", "+"},
			{"4", "5", "6", "-"},
			{"7", "8", "9", "/"},
			{"+/-", "0", ".", "*"},
			{"(", ")", "="}
	};
	
	private TextField affichage = new TextField("0");
	
	private Button clear = new Button("C");

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		
		//Première ligne de boutons
		HBox top = new HBox();
		top.setAlignment(Pos.CENTER);
		affichage.setPrefSize(270, 50);
		affichage.setEditable(false);
		clear.setPrefSize(50, 50);
		top.getChildren().addAll(affichage, clear);
		root.setTop(top);
		
		//Panneau principal de boutons
		VBox centre = new VBox();
		centre.setAlignment(Pos.CENTER);
		
		for (String[] strings : buttons) {
			HBox hb = new HBox();
			
			for (String string : strings) {
				Button btn = new Button(string);
				btn.setStyle("-fx-font-size: 25px");
				btn.setPrefSize(80, 80);
				hb.getChildren().add(btn);
			}
			centre.getChildren().add(hb);
		}
		
		//Modifier la taille du bouton =
		//Je récupère la dernière HBox de ma VBOX Centre
		HBox last = (HBox) centre.getChildren().get(centre.getChildren().size()-1);
		//Je récupère le dernier bouton de la Hbox récupérée
		Button lastBtn = (Button) last.getChildren().get(last.getChildren().size() - 1);
		lastBtn.setPrefWidth(160.0);
		lastBtn.setStyle("-fx-font-size: 35px");
	
		root.setCenter(centre);	
		Scene scene = new Scene(root, 320, 420);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculatrice");
		primaryStage.sizeToScene();
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
