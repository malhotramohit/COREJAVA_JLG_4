package com.gs.ilp.corejava.inheriatnce;

public class NokiaMobile implements Android, Windows {

	public void installPlayStore() {
		System.out.println("Android installed");
	}

	@Override
	public void installOffice() {
		System.out.println("Windows installed");
	}

	@Override
	public int m1() {
		return -1;
	}

	@Override
	public void m1(int a) {
		
	}

}
