package fr.eql.ai108.tp2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ColorHandler implements EventHandler<ActionEvent>{

	private ColorPanel colorPanel;
	private String color;
	
	public ColorHandler(ColorPanel colorPanel, String color) {
		super();
		this.colorPanel = colorPanel;
		this.color = color;
	}

	@Override
	public void handle(ActionEvent event) {
		colorPanel.setStyle("-fx-background-color: " + color);
		
	}

}
