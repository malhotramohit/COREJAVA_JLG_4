package com.gs.ilp.corejava.inheriatnce;

public class MyPoint {

	private int x;
	private int y;

	public MyPoint() {
		super();
		x = 0;
		y = 0;
	}

	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int[] getXY() {
		int[] array = { this.x, this.y };
		return array;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public double distance(int x, int y) {
		// x1 : this.x
		// X2 : x
		// Y1 : this.y
		// Y2 : y
		double disctance = Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
		return disctance;
	}

	public double distance(MyPoint point2) {
		return distance(point2.getX(), point2.getY());
	}

	public double distance() {
		// double disctance = Math.sqrt((0 - this.x) * (0 - this.x) + (0 - this.y) * (0
		// - this.y));
		// return disctance;
		return distance(0, 0);
	}
}
