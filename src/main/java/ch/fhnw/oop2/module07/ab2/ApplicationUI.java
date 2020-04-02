package ch.fhnw.oop2.module07.ab2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {
	private Label label;
	private Slider slider;

	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		label = new Label("5.0");
		slider = new Slider(1, 10, 5.0);
		slider.valueProperty().addListener(
				(observableValue, oldValue, newValue) -> label.setText(String.valueOf(observableValue.getValue())));
	}

	private void layoutControls() {
		this.setPadding(new Insets(15));
		this.setAlignment(Pos.CENTER);
		this.getChildren().add(label);
		this.getChildren().add(slider);
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setMajorTickUnit(1);
		slider.setSnapToTicks(true);
		getChildren().stream().forEach(button -> setMargin(button, new Insets(7)));

	}
}