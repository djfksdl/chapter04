package com.javaex.ex04;

public class Circle {
	//필드
	private int radius;
	
	//생성자
	public Circle() {
		super();
	}


	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	//메소드-gs
	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}

	//메소드-일반
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}
