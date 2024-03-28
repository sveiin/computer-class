package com.itwill.class05;

public class Subject {
	// field
    int korean;
    int english;
    int math;
    int science;
    
    // 생성자: 
    // 1. 기본 생성자
    public Subject() {
    	
    }
    
    // 2. argument를 갖는 생성자
    public Subject(int korean, int english, int math, int science) {
    	this.korean = korean;
    	this.english = english;
    	this.math = math;
    	this.science = science;
    }
    
    // 메서드:
    // 1. 총점 리턴
    public int getTotal() {
    	return korean + english + math + science;
    }
    
    // 2. 평균 리턴
    public double getMean() {
    	return (double) getTotal() / 4; // this.getTotal()도 가능
    }
    
    public void info() {
    	System.out.println("국어: " + korean); // this.은 생략가능
		System.out.println("영어: " + english);
		System.out.println("수학: " + math);
		System.out.println("과학: " + science);
		System.out.println("총점: " + getTotal());
		System.out.println("평균: " + getMean());
    }
}
