package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		Set<Point> pSet = new HashSet<Point>(); //인터페이스 이름이 Set
		
		Point p01 = new Point(1,2);
		Point p02 = new Point(3,6);
		Point p03 = new Point(5,10);
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
//		System.out.println(pSet.toString());
		
		Point p04 = new Point(3,6); //숫자가 똑같지만 다 다른 주소를 가지고 있다.
		pSet.add(p04);
//		System.out.println(pSet.toString());
		
		//주소가 같으면 hsahCode가 같으면 비교 안됨	- 3교시
//		해쉬코드 같으면 같을 확률이 굉장히 높아짐 but 같다는 아님.
//		다르면 1개만 비교해줘 검사가 필요없다. 
		//같다,틀리다는 필드값을 비교하는것. 필드값으로 만들어냄
		//해쉬코드 다르면 그냥 다른거. 같을 수가 없다. 다르다 확
		//해쉬코드 만들어준 이유, 비교하려고??
		
		/*for(Point p:pSet) {
			System.out.println(p.hashCode()); 
		}*/
		
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());//2번이랑 4번만 같으니까 hashcode검사함 나머지는 검사안하고 바로나옴
		System.out.println(p03.hashCode());
		System.out.println(p04.hashCode());
		
		//해쉬코드를 만든 이유: 주소인척하지만 주소를 고칠 수 있게 만든것
	}

}
