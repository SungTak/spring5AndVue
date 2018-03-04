package com.yst.study.common;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SungTak on 2018. 3. 4.
 */
public class StackTest {
	private Stack stack;

	@Before
	public void setUp() {
		stack = new Stack(5);
	}

	@Test
	public void testPushAndPop() {
		stack.push("1");
		stack.push("2");

		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

	@Test
	public void testPushFullAndPop() {
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push(4);
		stack.push(5);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

	@Test(expected = IllegalStateException.class)
	public void testPush_OverFlow() {
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push(4);
		stack.push(5);
		stack.push("6");

		System.out.println(stack.pop());
	}

	@Test(expected = IllegalStateException.class)
	public void testPush_UnderFlow() {
		stack.push("1");

		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}