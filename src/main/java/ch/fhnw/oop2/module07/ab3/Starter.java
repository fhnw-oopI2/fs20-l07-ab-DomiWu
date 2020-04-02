package ch.fhnw.oop2.module07.ab3;

import ch.fhnw.oop2.module07.ab3.ApplicationUI;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {
	@Override
	public void start(Stage primaryStage) {
		Parent rootPanel = new ApplicationUI();
		Scene scene = new Scene(rootPanel);
		primaryStage.setTitle("Arbeitsblatt (3)");
		primaryStage.setScene(scene);
		primaryStage.setWidth(350);
		primaryStage.setHeight(150);
		primaryStage.centerOnScreen();
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}