package com.itwill.enum01;

public enum Season3 {
	SPRING("봄"), // public static final Season3 SPRING = new Season3("봄");
	SUMMER(), // public static final Season3 SUMMER = new Season3();
	FALL("가을"),
	WINTER("겨울");
	
	private String name;
	
	// enum의 생성자의 접근 수식어는 private만 사용 가능. private은 생략 가능
	private Season3() {} 
	
	Season3(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
