package com.itwill.singleton;

// 싱글턴(singleton): 힙에 오직 한 개만 존재하는 객체
// 싱글턴 디자인 패턴(singleton design pattern)
// 클래스를 설계할 때 객체를 오직 하나만 생성할 수 있도록 작성하는 디자인 패턴
// 1. private static field // 타입 -> 자신의 클래스
// 2. private constructor 
// 3. public static method

public class Captain {

	// 1.
	private static Captain instance = null;
	
	private String name;
	
	// 2.
	private Captain() { // 공개가 되면 안 되기 때문에 argument가 없는 생성자도 직접 생성
		name = "캡틴 아메리카";
	} 
	
	// 3.
	public static Captain getInstance() {
		if(instance == null) {
			instance = new Captain();
		}
		
		return instance;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
