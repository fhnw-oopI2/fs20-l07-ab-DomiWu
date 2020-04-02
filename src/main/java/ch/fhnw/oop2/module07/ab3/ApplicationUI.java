package ch.fhnw.oop2.module07.ab3;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.converter.NumberStringConverter;

public class ApplicationUI extends VBox {
	private TextField txtField;
	private Slider slider;
	private NumberStringConverter converter;

	public ApplicationUI() {
		converter = new NumberStringConverter();
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		txtField = new TextField("5.0");
		slider = new Slider(1, 10, 5.0);
		txtField.textProperty().bindBidirectional(slider.valueProperty(), converter);
	}

	private void layoutControls() {
		this.setPadding(new Insets(15));
		this.setAlignment(Pos.CENTER);
		this.getChildren().add(txtField);
		this.getChildren().add(slider);
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setMajorTickUnit(1);
		slider.setSnapToTicks(true);
		getChildren().stream().forEach(button -> setMargin(button, new Insets(7)));

	}
}