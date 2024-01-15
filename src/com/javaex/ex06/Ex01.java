package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		
		//Set-확장된for문을 이용하여 주사위 중복 없는 6개 뽑기
		Set<Integer> iSet = new HashSet<Integer>();
		
/*		int num01 = (int)(Math.random()*45)+1;//이렇게 해도 위에 <Integer>로 박싱이 일어나기때문에 주소가 들어가서 오류 안남: 박싱 복습해보고 위에 박싱되는거 이해해보기
		Integer num02 = (int)(Math.random()*45)+1;
		Integer num03 = (int)(Math.random()*45)+1;
		Integer num04 = (int)(Math.random()*45)+1;
		Integer num05 = (int)(Math.random()*45)+1;
		Integer num06 = (int)(Math.random()*45)+1;
		
		iSet.add(num01); //<Integer>로 박싱되서 들어가있음
		iSet.add(num02);
		iSet.add(num03);
		iSet.add(num04);
		iSet.add(num05);
		iSet.add(num06);
		
		for(Integer num :iSet) {//Integer로 바꿨기 때문에 Integer로 num써줌. int로 써주면 toString을 못써줌.그땐 값에는 메소드가 없으니까! 주소를 타고 들어가야 쓸 수 있는 메소드가 있음
			System.out.println(num.toString());
		}
*/		
		//똑같은 숫자가 들어가면 5개만 나옴.그럼 중복은 체크되지만 내가 원하는 6자리 수가 나오지 않음
		
		//2. 반복을 줄이기위함
		
		while(true){
			if(iSet.size()>=6) {
				break;
			}
			int no = (int)(Math.random()*45)+1;//Integer로 봤을때도 되는지?->됨
			iSet.add(no);		
		}
		
/*		for(int c=0; c<6;c++) { 
			
			int no = (int)(Math.random()*45)+1;
			iSet.add(no);
		}*/
		
		for(Integer num :iSet) {
			System.out.println(num.toString());
		}
		
		
		
		
	}
}
