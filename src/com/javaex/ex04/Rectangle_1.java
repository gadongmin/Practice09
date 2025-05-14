package com.javaex.ex04;

public class Rectangle_1 extends Shape_1 implements Resizeable_1 {

	private double width;
	private double height;

	public Rectangle_1(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return this.width * this.height;
	}

	public double getPerimeter() {
		return (this.width + this.height) * 2;
	}

	public void resize(double s) {
		this.width = width * s;
		this.height = height * s;
	}

}