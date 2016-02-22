package fr.ece.mhu.tp3;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import fr.ece.mhu.tp3.model.Model;
import javafx.collections.ObservableList;

public class ModelTest {
	
	@Test
	public void testItems() {
		Model model = new Model();
		model.add("bbb");
		model.add("ccc");
		model.add("aaa");
		
		// Items
		ObservableList<String> observableList = model.items();
		String[] items = observableList.toArray(new String[observableList.size()]);
		
		// Copy items and sort them
		String[] orderedItems = new String[items.length];
		System.arraycopy(items, 0, orderedItems, 0, items.length);
		Arrays.sort(orderedItems);
		
		Assert.assertArrayEquals(items, orderedItems);
	}

}
