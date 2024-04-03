package com.itwill.inheritance06;

import java.util.Objects;

public class User {
	// field
	private String id;
	private String password;
	
	// constructors
	public User() {}
	
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	// toString 재정의 - id와 password를 출력
	@Override
	public String toString() {
		return "User(id = " + id + ", pw = " + password + ")";
	}
	
	// equals 재정의 - id가 같으면 같은 객체, 그렇지 않으면 다른 객체
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if(obj instanceof User && id != null) {
			User user = (User) obj;
			result = id.equals(user.id); // user.id 값은 상관없지만 this.id 값이 null이면 에러 발생 가능
		}
		
		return result;
	}
	
	// hashCode 재정의 - id가 같은 User 객체는 같은 정수값이 리턴되도록
	@Override
	public int hashCode() {
		return Objects.hash(id); // Objects 클래스의 hash() 메서드에 String 타입의 변수를 argument로 주면 주어진 문자열로 해시코드를 만들어줌 
	}
	

}
