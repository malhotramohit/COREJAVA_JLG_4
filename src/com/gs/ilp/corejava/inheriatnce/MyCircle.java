package com.gs.ilp.corejava.inheriatnce;

public class MyCircle {

	private MyPoint center;
	private int radius;

	public MyCircle() {
		super();
		center = new MyPoint();
		radius = 1;
	}

	public MyCircle(MyPoint center, int radius) {
		super();
		this.center = center;
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// MyCircle[radius=r,center=(x,y)]
	public String toString() {
		return "MyCircle[radius=" + radius + ",center=" + center + "]";
	}

	public int[] getCenterXY() {
		return center.getXY();
	}

	public void setCenter(int x, int y) {
		center.setXY(x, y);
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getCircumeference() {
		return 2 * Math.PI * radius;
	}

	public double getDistance(MyCircle myCircle) {
		// this.circle.center and mycircle.center
		return this.center.distance(myCircle.getCenter());
	}
}
