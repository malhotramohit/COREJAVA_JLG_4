package com.gs.ilp.corejava.inheriatnce;

import java.util.Arrays;

public class TestPoint {

	public static void main(String[] args) {
		MyPoint myPoint = new MyPoint(3, 4);
		System.out.println(myPoint);
		MyPoint myPoint2 = new MyPoint();

		myPoint2.setXY(4, 5);
		int[] pointvals = myPoint2.getXY();
		System.out.println(pointvals[0]);
		System.out.println(pointvals[1]);
		System.out.println(myPoint2);

		MyPoint p1 = new MyPoint(3, 0);
		MyPoint p2 = new MyPoint(0, 4);
		System.out.println(p1.distance(p2));
		System.out.println(p2.distance(p1));
		System.out.println(p2.distance(5, 6));
		System.out.println(p1.distance());

		MyPoint[] myPoints = new MyPoint[10];
		for (int i = 0; i < 10; i++) {
			myPoints[i] = new MyPoint(i, i);
		}

		Arrays.stream(myPoints).forEach(System.out::println);

	}

}
