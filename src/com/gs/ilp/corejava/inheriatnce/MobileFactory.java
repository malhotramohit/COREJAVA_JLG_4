package com.gs.ilp.corejava.inheriatnce;

public class MobileFactory {

	public static void main(String[] args) {
		NokiaMobile mobile = new NokiaMobile();// own type
		// Left mei parent and right child
		// Abstract class
		// Normal class
		// Interface
		mobile.installPlayStore();
		mobile.installOffice();
	}

}
