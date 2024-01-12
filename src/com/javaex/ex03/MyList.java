package com.javaex.ex03;

import java.util.Arrays;

public class MyList<T> {
	//Object List라고 생각하면됨 포인트,서클만 받을게아님
	
	//필드
	private T[] oArray;
	private int crtPos;
	
	//생성자
	public MyList() {
		//원래 만들지 않음 편의상 가정
		oArray = (T[])new Object[3];
		crtPos = 0;
	} 
	
	//메소드 - gs
	
	//메소드 - 일반
	public void add(T o) {
		
		//현재 배열 개수 + 1 배열을 새로 만든다.
		//이전 배열의 값을 새배열에 옮긴다.
		//마지막 방에 새주소를 추가한다.
		oArray[crtPos]= o;
//		crtPos = crtPos +1;
		crtPos += 1;
		
		public int size() {
			return crtPos;
		}
		public Object get (int index) {
			return oArray[index];
		}

	}
	

	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtPos=" + crtPos + "]";
	} 
	
}

// 
