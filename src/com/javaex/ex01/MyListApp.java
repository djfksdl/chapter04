package com.javaex.ex01;

import com.javaex.ex03.Circle;
import com.javaex.ex03.Point;

public class MyListApp {
	public static void main(String[] args) {
		
		/*
		Point[] pArray = new Point[3]; //배열은 기껏해야 한두개 변하거나할때만 써야함. 불편함(100개 해놓으면 뒤의 값 안정한것은 오류나고 공간이 남음)
		Point p1 = new Point(2,2);
		Point p2 = new Point(12,13);
		Point p3 = new Point(22,23);
		
		pArray[0] = p1; //p1은 주소다
		pArray[1] = p2;
		pArray[2] = p3;
		
		for(int i = 0; i<pArray.length; i++) {
			System.out.println(pArray[i].toString());
		}
		*/
		
		
		PointList pList = new PointList();
		
		Point p1 = new Point(2,2);
		Point p2 = new Point(12,13);
		Point p3 = new Point(22,23);
		
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		int count = pList.size();
		System.out.println(count);
		
		Point p = pList.get(0);
		System.out.println(p.getX());
		
		System.out.println(pList.toString());
		
		//원관리 - 포인트와 따로 관리
//		Circle c01 = new Circle(5);
//		pList.add(c01); 안됨
		
		CircleList cList = new CircleList();
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(10);
		
		cList.add(c01);
		cList.add(c02);
		
		System.out.println(cList.toString());
		
		//오늘의 전제는 포인트는 포인트대로, 서클은 서클대로 관리하고싶어서 로직 가정해서 만든것!- >여기 로직은 중요한게 아님
		// 하나가지고 여러개 관리할 수 있다 -> 부모를 둬서 자료형만 관리해 -> 공통 부모는 Object!
	
		
		
		
		
		
		
	}
}
