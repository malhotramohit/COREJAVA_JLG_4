package com.gs.ilp.corejava.inheriatnce;

interface Interface1 {
	void m1();
}

class Parent1 {
	int attr1;
	int attr2;
}

class Child2 extends Parent1 implements Interface1 {
	int attr3;

	@Override
	public void m1() {

	}
}

public class TestInterfacePtifalls {
	public static void main(String[] args) {
		Child2 child2 = new Child2();

		Parent1 child3 = new Child2();

		Interface1 child4 = new Child2();
		child4.m1();

		Child2 child5 = (Child2) child4;
	}

}
