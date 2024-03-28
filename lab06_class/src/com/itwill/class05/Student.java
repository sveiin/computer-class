package com.itwill.class05;

public class Student {
	// field
	// 만약 field에서 직접 초기화를 한다면 기본 생성자에는 그 값이 들어감
    int id; // 학생 번호
    String name; // 학생 이름
    Subject subject; // 수강 과목
    
    // 생성자:
    // 1. 기본 생성자
    // 타입 기본값: boolean-false, 정수-0, 실수-0.0, 참조타입-null
    public Student() {
    	
    }
    
    // 2. argument를 갖는 생성자
    public Student(int id, String name, Subject subject) {
    	this.id = id;
    	this.name = name;
    	this.subject = subject;
    }
   
    // 3. 생성자
    public Student(int id, String name, int korean, int english, int math, int science) {
        this.id = id;
        this.name = name;
        this.subject = new Subject(korean, english, math, science);
    }
    
    // 메서드: 학생의 정보(번호, 이름, 각 과목의 점수, 총점, 평균)를 출력.
    public void printInfo() {
    	
    	System.out.printf("번호: %d, 이름: %s\n", id, name);
    	if(subject != null) {
//    		System.out.printf("국어: %d, 영어: %d, 수학: %d, 과학: %d\n", subject.korean, subject.english, subject.math, subject.science);
//    		System.out.printf("총점: %d, 평균: %f\n", subject.getTotal(), subject.getMean());
        	subject.info();
    	} else {
    		System.out.println("Subject: null");
    	}
    	
    	// 지금으로썬 if 문으로 NullPointerException을 처리하는 게 베스트
    	// 필드에서 subject = new Subject();라고 초기화를 하더라도
    	// Student(int id, String name, Subject subject) {} 생성자에서
    	// subject에 null을 입력하면 NullPointerException이 발생할 수밖에 없음
    	
    }
    
}
