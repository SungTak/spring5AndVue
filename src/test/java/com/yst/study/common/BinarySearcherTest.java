package com.yst.study.common;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SungTak on 2018. 3. 4.
 */
public class BinarySearcherTest {
	private BinarySearcher searcher;

	@Test
	public void testSearch() {
		int[] collect = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 100};

		searcher = new BinarySearcher(collect);
		int result = searcher.search(3);
		assertEquals(3, result);

		result = searcher.search(5);
		assertEquals(5, result);

		result = searcher.search(100);
		assertEquals(100, result);

		result = searcher.search(1);
		assertEquals(1, result);

		result = searcher.search(99);
		assertEquals(0, result);
	}

}