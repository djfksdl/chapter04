package com.javaex.ex07;

import java.util.Objects;

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
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)//
			return true;
		if (obj == null)//
			return false;
		if (getClass() != obj.getClass()) //클래스 이름 다르면
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}
	
	@Override
	public int hashCode() {
		int result = x*y;
		return result;
	}
	//다른거 찾는 줄 알았는데 같은거?? 3교시 중간
	
	
}
