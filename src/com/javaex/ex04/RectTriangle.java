package com.javaex.ex04;

public class RectTriangle extends Shape {
	// 필드
	private double width;
	private double height;

	// 생성자
	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// 메소드
	public double getArea() {
		return this.width * this.height / 2;
	}

	public double getPerimeter() {
		double hypotenuse = Math.sqrt(width * width + height * height);
		return width + height + hypotenuse;
	}
}