package com.yst.study.common;

/**
 * Created by SungTak on 2018. 3. 4.
 */
public class BinarySearcher {
	private int[] collect;
	private int low;
	private int high;

	public BinarySearcher(int[] collect) {
		this.collect = collect;
		this.low = 0;
		this.high = collect.length;
	}

	public int search(int target) {
		int findItme = 0;
		while (low <= high) {
			findItme = divideMiddle(target, low, high);
			if (findItme != 0) {
				break;
			}
		}

		this.cleanLowAndHigh();
		return findItme;
	}

	private int divideMiddle(int target, int low, int high) {
		int middle = (low + high) / 2;

		int middleItem = collect[middle];

		if (middleItem > target) {
			this.high = middle - 1;
		} else if (middleItem == target) {
			return middleItem;
		} else {
			this.low = middle + 1;
		}
		return 0;
	}

	private void cleanLowAndHigh() {
		this.low = 0;
		this.high = collect.length;
	}
}
