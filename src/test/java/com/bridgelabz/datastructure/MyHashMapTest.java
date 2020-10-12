package com.bridgelabz.datastructure;

import org.junit.Test;
import org.junit.Assert;

public class MyHashMapTest {

	@Test
	public void givenASentence_WhenWordsAreAdded_Should_ReturnFrequency() {
		String sentence = "To be not to be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value += 1;
			myHashMap.add(word, value);
		}
		int frequency = myHashMap.get("to");
		System.out.println(myHashMap);
		Assert.assertEquals(2, frequency);
	}

}
