package com.javaex.ex01;

import java.util.Arrays;

import com.javaex.ex03.Point;

public class PointList {
	//필드
	private Point[] pArray;
	private int crtPos;
	
	//생성자
	public PointList() {
		//원래는 만들지 않음. 편의상 가정
		pArray = new Point[3];
		crtPos =0;
	}
	
	//메소드-gs
	
	
	//메소드-일반
	
	public void add(Point p) {
		//배열새로 만들고 이전거 복사하고 추가하고...
		//pArray[0] = p;
		
		//현재 배열 개수 + 1 배열을 새로 만든다.
		//이전 배열의 값을 새 배열에 옮긴다.
		//마지막 방에 새주소를 추가한다.
		pArray[crtPos]= p;
//		crtPos = crtPos +1;
		crtPos += 1;
	} 
	
	public int size() {
		//return 3;
		return crtPos; //갯수랑 이 포인트랑 값이 같아서
	}
	
	public Point get(int index) { //자바가 내 마음을 알리 없으니 방번호 받는다.
		return pArray[index];//index방 안에 있는 Pom 주소
	}

	@Override
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(pArray) + ", crtPos=" + crtPos + "]";
	}
	
	
}
