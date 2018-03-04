package com.yst.study.common;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by SungTak on 2018. 3. 4.
 */
public class ReverseTest {
	private Reverse<String> reverse;

	@Test
	public void testReverse() {
		reverse = new Reverse<>(Arrays.asList("a", "b", "cd", "zzzz"));
		List<String> result = reverse.execute();
		result.stream().forEach(System.out::println);

		assertEquals(4, result.size());
	}

	@Test
	public void testReverseString() {
		String result = Reverse.reverseString("abcdefg123");
		assertEquals("321gfedcba", result);
	}
}