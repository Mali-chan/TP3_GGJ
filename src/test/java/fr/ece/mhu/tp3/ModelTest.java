package fr.ece.mhu.tp3;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ModelTest {
	
	@Test
	public void testItems() {
		Model model = new Model();
		model.add("bbb");
		model.add("ccc");
		model.add("aaa");
		
		String[] items = (String[]) model.items().toArray();
		
		String[] orderedItems = new String[items.length];
		System.arraycopy(items, 0, orderedItems, 0, items.length);
		Arrays.sort(orderedItems);
		
		Assert.assertArrayEquals(items, orderedItems);
	}

}
