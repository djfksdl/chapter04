package com.javaex.ex02;

public class Point {

	//필드
	private int x;
	private int y;
	
	
	//생성자
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	
	//메소드-gs	
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
	
	//메소드-일반
	@Override
	public String toString() { //이거 안짜면 주소@어쩌고가 나옴(Object꺼 쓰는거라서)
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
}
