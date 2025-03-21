package com.itwill.method02;

/*
 * 메서드 선언(정의) 방법:
 * [수식어] 리턴타입 메서드이름([파라미터 선언, ...]) { code; ...}
 * - 수식어 생략 가능
 * - argument를 갖지 않는 메서드는 파라미터를 선언하지 않음
 * - 메서드의 반환값이 없는 경우에는 리턴 타입으로 void를 사용
 * - 메서드는 클래스 안에서만 선언
 * - 다른 메서드 안에서 메서드를 선언할 수 없음
 */

public class MethodMain02 {

	public static void main(String[] args) {
		// argument가 필요하고 반환값이 있는 메서드 작성 연습
		
		// ctrl + 메서드 위로 커서 가져가면 메서드가 선언된 곳으로 이동
		// alt + <- 키 누르면 다시 호출한 곳으로 이동
		double result = add(1.0, 2.0); // add 메서드 호출
		System.out.println("result = " + result);
		
		// subtract, multiply, divide 메서드를 호출하고, 그 결과를 출력.
		result = subtract(1.0, 2.0);
		System.out.println("result = " + result);
		
		result = multiply(1.0, 2.0);
		System.out.println("result = " + result);
		
		result = divide(1.0, 2.0);
		System.out.println("result = " + result);
		
	} // end main
	
	/**
	 * 숫자 2개를 전달받아서, 두 숫자의 덧셈 결과를 반환 
	 * @param x 실수(double)
	 * @param y 실수(double)
	 * @return x + y를 반환
	 */
	public static double add(double x, double y) {
		return x + y; // return 문: 메서드를 호출한 곳으로 값을 반환하는 문장
	}
	
	/**
     * subtract.
     * 숫자 2개를 전달받아서, 두 숫자의 뺄셈 결과를 반환.
     * @param x 실수(double).
     * @param y 실수(double).
     * @return x - y를 반환.
     */
    public static double subtract(double x, double y) {
        return x - y;
    }
    
    /**
     * multiply.
     * 숫자 2개를 전달받아서, 두 숫자의 곱셈 결과를 반환.
     * @param x 실수(double).
     * @param y 실수(double).
     * @return x * y를 반환.
     */
    public static double multiply(double x, double y) {
        return x * y;
    }
    
    /**
     * divide.
     * 숫자 2개를 전달받아서 첫번째 argument를 두번째 argument로 나눈 결과를 반환
     * @param x 나뉨수
     * @param y 나누는 수. 0이 아니어야 함
     * @return x / y를 반환
     */
    public static double divide(double x, double y) {
        return x / y;
    }
    
} // end class
