package com.yst.study.common;

/**
 * Created by SungTak on 2018. 3. 4.
 */
public class Stack {
	private Object[] collect;
	private int point;

	public Stack(int size) {
		this.collect = new Object[size];
		this.point = 0;
	}

	public void push(Object object) {
		if (point >= collect.length) {
			throw new IllegalStateException("가득차서 더 이상 넣을 수 없습니다.");
		}

		this.collect[point] = object;
		point++;
	}

	public Object pop() {
		point--;
		if (point < 0) {
			throw new IllegalStateException("더 이상 가져올 요소가 없습니다.");
		}

		return this.collect[point];
	}
}
