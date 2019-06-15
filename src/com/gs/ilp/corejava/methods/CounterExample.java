package com.gs.ilp.corejava.methods;

public class CounterExample {

	static int count = 0;

	void increment() {
		count++;
		System.out.println("count is " + count);
	}

	public static void main(String[] args) {

		CounterExample counterExample1 = new CounterExample();
		CounterExample counterExample2 = new CounterExample();
		CounterExample counterExample3 = new CounterExample();

		counterExample1.increment();
		counterExample2.increment();
		counterExample3.increment();

	}

}
