package com.itwill.inheritance02;

public class InheritanceMain02 {

	public static void main(String[] args) {
		// BusinessPerson 타입 객체 생성:
		BusinessPerson person1 = new BusinessPerson(); // 지역 변수에는 부모 클래스인 Person의 주소값을 가지고 있음
		System.out.println(person1.getName() + " : " + person1.getCompany());
		
		BusinessPerson person2 = new BusinessPerson("아이티윌");
		System.out.println(person2.getName() + " : " + person2.getCompany());
		
		BusinessPerson person3 = new BusinessPerson("오쌤", "아이티윌");
		System.out.println(person3.getName() + " : " + person3.getCompany());
	}

}
