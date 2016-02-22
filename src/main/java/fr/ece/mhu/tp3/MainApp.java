package fr.ece.mhu.tp3;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApp extends Application {
	
	private static final String APP_TITLE = "MainApp";
	
	private Stage primaryStage;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle(APP_TITLE);
		this.primaryStage.show();
		
		showListView();
	}
	
	private void showListView() {
		FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("view/ListView.fxml"));
        
        try {
			AnchorPane listView = (AnchorPane) loader.load();
			Scene scene = new Scene(listView);
			primaryStage.setScene(scene);
		} catch (IOException e) {
			System.err.println("Error while loading view/ListView.fxml");
		}
	}

}
