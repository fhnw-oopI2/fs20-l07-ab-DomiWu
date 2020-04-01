package ch.fhnw.oop2.module07.ab1;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class ApplicationUI extends FlowPane {
	private Button button;
	private int counter = 1;

	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		button = new Button("Add Label");
		button.setOnAction(event -> {
			this.getChildren().add(new Label("Label " + counter));
			counter++;
		});
	}

	private void layoutControls() {
		this.setPadding(new Insets(5));
		this.getChildren().add(button);
		this.setVgap(7);
		this.setHgap(7);
	}
}