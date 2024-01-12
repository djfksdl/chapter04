package com.javaex.ex01;

import java.util.Arrays;

import com.javaex.ex03.Circle;

public class CircleList {
	//필드
	private Circle[] cArray;
	private int crtPos;//화살표개념

	
	//생성자
	public CircleList() {
		cArray = new Circle[3];
		crtPos = 0;
	}


	public CircleList(Circle[] cArray, int crtPos) {
		super();
		this.cArray = cArray;
		this.crtPos = crtPos;
	}
	//메소드 gs
	public Circle[] getcArray() {
		return cArray;
	}


	public void setcArray(Circle[] cArray) {
		this.cArray = cArray;
	}


	public int getCrtPos() {
		return crtPos;
	}


	public void setCrtPos(int crtPos) {
		this.crtPos = crtPos;
	}
	
	//메소드 일반
	public void add(Circle p) {
		
		//현재 배열 개수 + 1 배열을 새로 만든다.
		//이전 배열의 값을 새배열에 옮긴다.
		//마지막 방에 새주소를 추가한다.
		cArray[crtPos]= p;
//		crtPos = crtPos +1;
		crtPos += 1;
	}


	public int size() {
		return crtPos; //갯수랑 이 포인트랑 값이 같아서
	}
	
	public Circle get(int index) { //내 마음을 알리 없으니 방번호 받는다.
		return cArray[index];//index방 안에 있는 Pom 주소
	}
	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", crtPos=" + crtPos + "]";
	}
	
}
