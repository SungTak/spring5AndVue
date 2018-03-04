package com.yst.study.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SungTak on 2018. 3. 4.
 */
public class Reverse<T> {
	private List<T> collect;

	public Reverse(List<T> collect) {
		this.collect = collect;
	}

	public List<T> execute() {
		List<T> reversed = new ArrayList<>(this.collect.size());

		int i = this.collect.size() - 1;
		for (; i >= 0; i--) {
			reversed.add(this.collect.get(i));
		}

		return reversed;
	}

	public static String reverseString(String text) {
		char[] characters = text.toCharArray();

		char[] reversedCharacters = new char[characters.length];

		int i = characters.length - 1;
		int j = 0;
		for (; i >= 0; i--) {
			reversedCharacters[j] = characters[i];
			j++;
		}

		return new String(reversedCharacters);
	}
}
