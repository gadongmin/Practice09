package com.javaex.ex04;

public class RectTriangle_1 extends Shape_1 {
	private double width;
	private double height;

	public RectTriangle_1(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return this.width * this.height / 2;
	}

	public double getPerimeter() {
		double hy = Math.sqrt(width * width + height * height);
		return this.width + this.height + hy;
	}

}