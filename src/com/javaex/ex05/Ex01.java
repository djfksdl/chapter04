package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		Set<Integer> iSet= new HashSet<Integer>();//제네릭으로 선언해줘야함. 범용으로 만들어놨는데 오만가지 다 만들어놔가지구<>안에는 주소로 줘야함. 나중에 바꿔치기할때 Set에만 있는거 쓰려구
		
		//그전에는 ex04참고) pList.add(p01);로 ()안에 주소로 관리를 했음. <Point>를 관리하는것
		//그래서 <Integer>로 선언했으니 int값이 아닌 주소를 넣어줘야함. 
		/*int a = 3; ->여기는 값이 들어가는것
		Integer b = 3; => Integer b = new Integer(3);이 자동으로 박싱되면서 주소가 들어가는것임!*/

		Integer i01 = new Integer(3);
		Integer i02 = new Integer(6);
		Integer i03 = new Integer(9);
		
		iSet.add(i01); //List랑 add()라는 메소드 이름이 같지만 List의 것이 아닌 Set에서 그냥 이름을 똑같이 만들어 놓은거임. 이 add는 Set안에 있는 add를 쓴것!
		iSet.add(i02);
		iSet.add(i03);
		
		System.out.println(iSet.size());
		System.out.println(iSet.toString()); //Object에 있는 toString
		
		System.out.println("------------------");
		
		//for while - for문은 방번호로 주로 썼고, while은 조건으로 끝나는거. 얼만큼 반복되는지 몰랐을때는 while
		/*for(int i = 0; i<iSet.size(); i++) {
			iSet[i] 아니면 iSet.get(i)를 넣었음. 이 이야기는 방번호가 있다는것(배열은 순서가 있다) Set은 방번호가 없어서 이렇게 돌아갈 수가 없다.
		}*/
		
		//향상된 for문
		for( Integer num : iSet) {// 원래 for는 범위를 조절할 수 있었다. i값을 2칸씩 옮긴다던지.. 이건 끝까지 도는거임. 순서가 없으니까 얘 규칙대로 다 돎. ':' 뒤쪽에는 돌아야하는 주소 통채로 넣어줌. 반복해야하는 애.(주소를 준거임). 얘는 하나씩 출력할 수 있음. 동시에 한꺼번에 출력못함.앞에는 돌때 한번에 일해야하는걸 num이라는 이름을 가진 것에 담아서 하나씩 하나씩 주소 넣어서 할거임 
			//int로 해도됨 .자동으로 형변환이 되니까
			//기존for문으로는 돌릴 수 없다. 순서가 없기때문에
			System.out.println(num.toString());
		}
		
		System.out.println("------------------");
		Integer i04 = new Integer(6); // 같은 값으로 보이지만 위치가 다름. 주소를 넣어준것! - > 만약 100을 넣어주면 3,100,6,9로 새로 들어갈거임(근데 순서는 랜덤으로 나옴)
		iSet.add(i04);
		System.out.println(iSet.size());
		//같은 값을 넣었으니 자기 선에서 처리한것같음. (Set은 중복이 안되는 애니까)
		
		System.out.println(iSet.toString()); 
		
		for( Integer num : iSet) {
			System.out.println(num.toString());
		}
		
		
		
	}

}
