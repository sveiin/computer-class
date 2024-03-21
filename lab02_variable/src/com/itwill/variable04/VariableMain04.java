package com.itwill.variable04;

public class VariableMain04 {

	public static void main(String[] args) {
		// 문자(character) 타입 변수 char
		// char 타입: 문자 1개의 유니코드 값(2바이트 정수)를 저장하는 타입
		// 문자는 작은따옴표를 사용('a'), 문자열은 큰따옴표를 사용("abc")
		
		char ch1 = 'B';
		System.out.println(ch1);
		System.out.println((int) ch1);
		
		// char는 문자의 유니코드를 저장하는 특별한 종류의 정수 타입
		// -> 사칙연산이 가능 / 크기 비교도 가능	
		char ch2 = (char) (ch1 + 1);
		System.out.println(ch2);
		
		char ch3 = (char) (ch1 - 1);
		System.out.println(ch3);
		
		// 1. 변수는 같은 타입의 값만 저장할 수 있음
		// 2. 큰 범위의 타입에는 작은 범위 타입의 값을 저장할 수 있음
		float x = 1.0F; // 자바 실수 기본 타입 double
		System.out.println(x);
		// 3. 작은 범위의 타입에 큰 범위의 값을 저장하려고 하면 에러가 발생
		// 4. 정수 리터럴(literal, 상수)은 범위를 넘지 않으면 byte, short, char에 저장 가능
		// 위에 char ch3 = (char) (ch1 - 1)에서 (ch1 - 1)은 리터럴이 아님 ch1이 변수 
		short s = 123; // 3번 예외... 4번 해당
		// 강제 타입 변환(casting): 변수의 타입을 강제로 바꿈
		
		
		
		
		
		// 양수 -> 음수 비트 변환 0은 1로, 1은 0으로 바꿔서 마지막에 + 1
		// double 타입 저장 방식 (부호, 가수, 지수)
	}

}
