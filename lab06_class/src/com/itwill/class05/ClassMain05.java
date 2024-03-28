package com.itwill.class05;

public class ClassMain05 {

	public static void main(String[] args) {
		// Subject, Student 클래스 객체 생성과 메서드 호출 결과 테스트.
		
		// 기본 생성자를 사용해서 Subject 타입의 객체 생성
		Subject sub1 = new Subject();
		sub1.info();
		
		System.out.println("------------------------");
		
		// argument를 갖는 생성자를 사용해서 Subject 타입의 객체 생성
		Subject sub2 = new Subject(100, 90, 50, 70);
		sub2.info();
		
		System.out.println("------------------------");
		
		// argument를 갖는 생성자를 사용해서 Student 타입의 객체 생성
		Student student1 = new Student(1, "홍길동", sub2);
        student1.printInfo();
		
        System.out.println("------------------------");
        
		// 기본 생성자를 사용해서 Student 타입의 객체 생성
		Student student2 = new Student();	
		student2.printInfo();
		
		System.out.println("------------------------");
		
		// Student 생성자 3을 사용해서 객체 생성
        Student student3 = new Student(10, "오쌤", 10, 20, 30, 25);
        student3.printInfo();
	}

}

// 참조타입 변수에만 null이 들어감 (참조할 주소x)
// String s = "";와 String s = null;은 다름