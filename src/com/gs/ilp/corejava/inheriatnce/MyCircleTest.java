package com.gs.ilp.corejava.inheriatnce;

public class MyCircleTest {
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(3, 4);
		MyCircle circle1 = new MyCircle(p1, 10);
		System.out.println(circle1);
		System.out.println("Area is " + circle1.getArea());
		System.out.println("Circum is " + circle1.getCircumeference());

		// distance bw centers
		MyPoint p2 = new MyPoint(2, 8);
		MyCircle circle2 = new MyCircle(p2, 20);

		System.out.println("Distance is " + p1.distance(p2));
		System.out.println("Distance is " + circle1.getDistance(circle2));

	}

}
