package fr.ece.mhu.tp3.controller;

import fr.ece.mhu.tp3.model.Model;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class Controller {
	
	private Model model;
	
	@FXML
	private ListView<String> listView;
	
	public Controller() {
		model = new Model();
		model.add("Doc");
		model.add("Dopey");
		model.add("Bashful");
		model.add("Grumpy");
		model.add("Sneezy");
		model.add("Sleepy");
		model.add("Happy");
	}
	
	@FXML
	public void initialize() {
		this.listView.setItems(model.items());
	}

}
