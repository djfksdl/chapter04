package com.javaex.ex08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {
	public static void main(String[] args) {
		Map<String ,Point> pMap = new HashMap<String, Point>();//키값은 보통 String모양으로 쓴다.
		
		Point p01 = new Point(2,100002);//관리하는 애들만 규칙이 달라지는거지 이건 똑같다.
		Point p02 = new Point(5,2);
		Point p03 = new Point(12,22);
		
		pMap.put("정우성", p01); //얘네는 add역할을 하는게 put이다. 정우성의 실적이다. 관리하는 값p01을 넣어준다.
		pMap.put("이효리", p02); //앞에는 String으로 관리한다고하니 그냥 숫자로 쓰면 오류남
		pMap.put("박명수", p03); 
		
		System.out.println(pMap.size());
		System.out.println(pMap.toString());//toString은 개발용으로 찍어보는거임. 전체를 도는게 아님
		
		System.out.println(pMap.get("정우성").getY()); //정우성까지는 0x777임. getY()는 정우성의 y값을 꺼내오고싶을때 쓰는 방법
		//보통 하나씩 꺼낸다.
		
		//좌표 같은게 같아도 상관없음. 얘는 값이 중복된거 들어가도 상관없음. 이름으로 구별할꺼니까
		Point p04 = new Point(100, 100);
		pMap.put("박명수", p04);//중복 상관없이 새로운걸로 수정된다는 개념으로 넣는다. 이름은 안겹치게 관리하는거임. 먼저 어? 키값이 같네. 하면 안돼!가 아니라 나중 값으로 수정해버림
		System.out.println(pMap.toString());
		
		//key 리스트:[정우성, 이효리, 박명수] -키를 관리하고 있음
//		pMap.keySet();으로 관리하고 있음. 그러면 key 리스트를 줌 -> 주소임
		Set<String> keys = pMap.keySet(); //중복검사하려면 Set으로 관리함.주머니에 이름만 넣어놓고 있다는 Set의 개념을 활용해서!

		//키 전체출력하기
		/*for( String name : keys) {//이름은 내가 아무거나 지어도됨 : name
			System.out.println(name);
		}*/
		
		//전체 출력하기
		System.out.println("=====================================");
		for(String name : keys) {
			System.out.println(name);
			System.out.println(pMap.get(name).toString());
			System.out.println(pMap.get(name).getY());
		}
		//엄청 많은 데이터를 무작위로 넣었을때 쓰이는것보다 많지 않은 데이터에 키값을 기억하고 있을때 씀. 그거중에 하나만 담아야할때, (Title같이 다 구별할 수 있게 함.) 그래서 보통 전체출력하기같이는 쓰지않음..?(4교시 마지막)
		//Map도 순서대로 나오진않음!!
		
		
	}

	
}
