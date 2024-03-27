package com.itwill.class02;

// 클래스(class): 객체 설계도. 데이터(필드) + 생성자 + 기능(메서드) => 변수 타입
public class Score {
	// 필드(field). 멤버 변수
	int java;
	int sql;
	int javascript;
	
	// 생성자(constructor)
	// 객체를 생성하고, 객체의 필드들을 초기화하는 역할
	// 생성자의 이름은 반드시 클래스의 이름과 같아야 함!
	// 생성자를 작성하는 방법은 메서드 작성 방법과 비슷하지만, 리턴 타입이 없음
	// 클래스를 선언할 때 생성자를 하나도 정의하지 않으면,
	// 자바 컴파일러가 기본 생성자를 자동으로 작성해줌
	// 클래스를 선언할 때 생성자를 직접 정의한 경우에는,
	// 자바 컴파일러가 기본 생성자를 자동으로 만들어 주지 않음!
	// 생성자 오버로딩: parameter가 다른 생성자를 여러개 만들 수 있음
	
	// 기본 생성자(default constructor): argument를 갖지 않는 생성자
	public Score() {
		// 아무런 코드를 작성하지 않아도 됨
		// 코드가 없어도 모든 필드들을 그 필드 타입의 기본값으로 초기화를 해줌
	}
	
	// argument를 갖는 생성자
	public Score(int java, int sql, int js) {
		this.java = java;
		this.sql = sql;
		javascript = js; // field 이름과 parameter 이름이 다를 경우 this 생략 가능. 그렇지만 일관성 유지...
	}
	
	// 메서드(method)
	public int getTotal() {
		return java + sql + javascript;
	}
	
	public double getMean() {
		return (double) getTotal() / 3;
	}
}
