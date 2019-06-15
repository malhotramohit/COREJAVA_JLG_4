package com.gs.ilp.corejava.methods;

public class Utility {

	static boolean isEven(int id) {
		boolean flag = false;
		if (id % 2 == 0) {
			flag = true;
		} else {
			flag = false;
		}

		return flag;
	}

}
