package fr.ece.mhu.tp3.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {
	
	private ObservableList<String> observableList;
	
	public Model() {
		this.observableList = FXCollections.observableArrayList();
	}
	
	public boolean add(String s) {
		if (observableList.add(s)) {
			FXCollections.sort(observableList);
			return true;
		}
		return false;
	}
	
	public ObservableList<String> items() {
		return observableList;
	}

}
