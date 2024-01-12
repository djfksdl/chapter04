package com.javaex.ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyListApp {
	public static void main(String[] args) {
		// add(), size() ,get(), remove()
//		ArrayList<Point> pList = new ArrayList<Point>(); -임포트해줘야함
//		LinkedList<Point> pList = new LinkedList<Point>(); -임포트 해줘야함
		//안에 알고리즘이 달라서그렇지 공통적으로 어레이나 링크드나 가지고있는 메소드가 있어서 바로 실행된다.(3개는!어레이나,링크드나 뭐 하나)- 근데 이름 다른 새로운 sAdd()는 Array만 만들어주면 나중에 링크드로 바꿔치기하면 그건 실행이 안됨
		List<Point> pList = new LinkedList<Point>(); //섞어써주기 Linked나 ArrayList써주면 가려지면서 인터페이스안에 있는 3가지만 써줄 수 있음. 원래는 안가려짐. 섞어써주면 가려짐!
		
		Point p01 = new Point(2, 2);
		Point p02 = new Point(3, 3);
		Point p03 = new Point(4, 4);
		
//		Circle c01 = new Circle(1000);

		pList.add(p01); // 원래 아무거나 받아도되는데 위에 <Point>로 잡아줘서 point밖에 값을 안받음
		pList.add(p02);
		pList.add(p03);
		pList.add(p01); // 첫번째 4번째는 같은 주소를 가지고 있는것이다. 값이 아닌 주소!
		
		//안되는거 테스트중
		//pList.add(c01); //오류가 남 와이??틀은 하나..

		// 가변한다고 했으니 배열 크기가 어떻게 되는지 확인해보자 -> 값을 넣은만큼 크기가 변한다.
		System.out.println("size: " + pList.size());

//		 변수로 y값 가져오기
		System.out.println(p01.getY()); // 벋 이거말고 이제 pList라는 배열로 y값을 알아내겠다!

//		리스트를 통해서 y값 가져오기
		/*
		 * Point var01 = pList.get(0); var01.getY();//여러번 부르려면 이게 나음
		 */

//		pList.get(0).getX(); //같은 말인데 한번만 출력하려면 이게 나음

		System.out.println(pList.get(0).getX());
		System.out.println(pList.get(0).toString());

		System.out.println("==================");

		// 전체 출력
		for (int i = 0; i < pList.size(); i++) { // 배열이 아니라서 length를 못쓰고 있는 메소드이 size를 써야 길이를 알 수 있다.
			System.out.println(pList.get(i).toString());
		}

		System.out.println("==================");
		pList.remove(0); // 몇번째 방을 지우냐고 물어봄
		// 전체 출력
		for (int i = 0; i < pList.size(); i++) { 
			System.out.println(pList.get(i).toString());
		}

		// (111) 222 333 111주소를 가지고있음
		System.out.println("==================");
		pList.remove(p02); //remove도 2가지 종류가 있는데 int를 넣거나 object인 주소를 넣을 수 있음. 이건 주소 넣는거

		// 전체 출력
		for (int i = 0; i < pList.size(); i++) { 
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println(pList.toString());
		
		//pList.sAdd();  기능 만들고싶어서 추가함  
		
		/////////////////////////////////////////////////
		
		//인티저같은 애들은 클래스가 이미 만들어져있기 때문에 안만들어도됨- 로또같이 숫자만 관리하겠다.
//		ArratList<int>() 여기 <>안에는 대문자로 된 애들만 써야함. 숫자만쓰고싶어도 주소를 넣어야하니까! 딸려오는 메소드들은 쓸 수 있음
		
		List<Integer> iList = new ArrayList<Integer>();//섞어쓰기. 나중에 바꿔쓸생각하면 섞어써서 가려주고 공통부분만 쓰게함
		
//		Integer i01 = new Integer(3); // 숫자를 관리하더라도 주소를 넣어야해서 대문자로 써줘야함. 그리고 클래스애들은 new안하고 바로 써줌 왼쪽에 있는 Integer의 규칙을 따름
//		Integer i02 = new Integer(6);
		Integer i01 = 3;//숫자 3이 아닌 주소가 들어가있다고 생각해야함 (박싱)
		Integer i02 = 6; //자동박싱
		
		iList.add(i01);
		iList.add(i02);
		
		System.out.println(iList.toString());
		
//		iList.get(0).parseInt(null)//메소드에 접근할 수 있지만 parseInt는 static이기때문에 이렇게 쓰는건 옮지 않다.
		
		
	}
}
