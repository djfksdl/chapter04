package com.javaex.ex03;

public class MyListApp {
	public static void main(String[] args) {
		
//		// 점 관리
//		MyList<Point> pList = new MyList<Point>();//범용이지만 이건 포인트 관리한다. = MyList<Point>:제네딕 -> 올릴떄 자료형 변경해야함.
//		Point p01 = new Point(2,2);
//		Point p02 = new Point(5,5);
//		Point p03 = new Point(10,10);
//		
//		pList.add(p01);
//		pList.add(p02);
//		pList.add(p03);
//		
//		System.out.println(pList.toString());
//		
//		//원 관리
//		MyList<Cricle> cList = new MyList<Cricle>();
//		Circle c01 = new Circle(100);
//		Circle c02 = new Circle(200);
//		
//		cList.add(c01);
//		cList.add(c02);
//		cList.add(p02); //데이터가 섞이면 관리가 힘들다(문제점 해결해야함)
//		System.out.println(cList.toString());
//	}
		
		//점관리
		MyList<Point> pList = new MyList<Point>();
		Point p01 = new Point(2,2);
		Point p02 = new Point(12,12);
		Point p03 = new Point(22,22);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		System.out.println(pList.toString());
		
		//원관리
		MyList<Circle> cList = new MyList<Circle>();
		Circle c01 = new Circle(100);
		Circle c02 = new Circle(200);
		
		cList.add(c01);
		cList.add(c01);
		cList.add(c01);
		System.out.println(cList.toString());
		
		//틀은 하나 만들어서 계속 복사해서 써두자
}
}
