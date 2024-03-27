package com.itwill.class04;

public class ClassMain04 {

	public static void main(String[] args) {
		// 기본 생성자를 사용해서 Rectangle 객체 생성, 메서드 호출
		Rectangle rect1 = new Rectangle();
		System.out.println("rect1: " + rect1); // @...(8자리 <- 16진수, 4바이트)가 힙 영역 메모리 주소
		System.out.println("rect1 넓이: " + rect1.getArea());
		System.out.println("rect1 둘레: " + rect1.getPerimeter());
		
		// argument를 갖는 생성자를 사용:
		Rectangle rect2 = new Rectangle(3.0, 4.0);
		System.out.println("rect2: " + rect2);
		System.out.println("rect2 넓이: " + rect2.getArea());
		System.out.println("rect2 둘레: " + rect2.getPerimeter());
		
		rect2 = new Rectangle(4, 3);
		System.out.println("rect2: " + rect2);
		
		
		// -------------------------------------------------------------------
		
		
		// 메모리:
		// 메서드 영역: 클래스의 바이트 코드, static 변수/메서드
		// 스택(stack) 영역: 지역변수 -> 기본타입 변수, 참조타입 변수(힙 영역 메모리 주소를 담고 있고 4바이트로 표현)
		// 힙(heap) 영역: 인스턴스, 배열
		
		// int 타입 a[1] = 1; -> a가 가리키는 메모리 주소로 감
		// 그리고 인덱스 번호만큼 4바이트(int)씩 지나쳐서 값을 찾아감
		
		// 메서드, 생성자와 같은 설계도는 메서드 영역에 존재하고 데이터(변수)만 heap 영역에 있다고 생각하면 될 듯
		
		// . <- 참조 연산자
		
		// 0x12 <- 16진수. 10진수로 바꾸면 1 * 16^1 + 2 * 16^0 = 16 + 2 = 18
		// 숫자 한 자리당 4비트. 1은 0001, 2는 0010. 2진수로 10010
		// 4비트인 이유: 4비트에 2진수 1을 전부 채우면 15. 16으로 넘어가는 순간 자리수 올라감

		// 8비트 = 1바이트
		// 1바이트에 전부 1을 채워넣으면 255
		
		// stack 영역에서는 데이터가 쌓였던 순서의 역순으로 지워짐
		// ex. int result = add(1, 3); ~ add(int x, int y) {}
		// result -> x -> y 순으로 쌓였다가 메서드 끝나면 y -> x 순으로 지워짐
		// 메인 메서드가 끝나면 result도 지워짐
		
		// heap 영역에 있는 데이터는 참조변수와 참조가 끊어지는 순간 지워짐
		// -> 참조변수가 사라지거나 참조변수가 가리키는 메모리 주소가 바뀌는 경우
		// -> garbage collector
	}

}
