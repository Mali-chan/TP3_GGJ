package fr.ece.mhu.tp3.controller;

import fr.ece.mhu.tp3.Model;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class Controller {
	
	@FXML
	private Model model;
	
	@FXML
	private ListView<String> listView;
	
	public Controller(Model model) {
		this.model = model;
	}
	
	@FXML
	public void initialize() {
		this.listView.setItems(model.items());
	}

}
