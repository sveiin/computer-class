package com.itwill.enum01;

public class Season2 {
	
	public static final Season2 SPRING = new Season2("봄"); // 메서드 영역에 SPRING이라는 변수가 만들어지고
														   // 그 변수 안엔 heap 영역에 생성된 주소값이 저장됨
	public static final Season2 SUMMER = new Season2("여름");
	public static final Season2 FALL = new Season2("가을");
	public static final Season2 WINTER = new Season2("겨울");
	
	private String name;
	
	private Season2(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
