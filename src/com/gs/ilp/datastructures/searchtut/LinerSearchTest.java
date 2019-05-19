package com.gs.ilp.datastructures.searchtut;

public class LinerSearchTest {

	public static void main(String[] args) {
		// input array
		int[] arr = { -1, 3, 5, 6, 3, 2, 5, 8 };
		// to check found or not
		int flag = -1;
		// number to find
		int num = 3;
		// traversal
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				flag = i; // to get the index
				break;
			}
		}
		// checking whether found or not
		if (flag >= 0) {
			System.out.println("Found at index " + flag);
		}
	}

}
