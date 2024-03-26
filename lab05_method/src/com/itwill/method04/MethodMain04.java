package com.itwill.method04;

import java.util.Random;

public class MethodMain04 {

	public static void main(String[] args) {
		// 다양한 리턴 타입:
		
		Random rand = new Random();

		int num = rand.nextInt(100);
		System.out.println("number = " + num);
		
		// Ex1. isEven(정수): 정수가 짝수이면 true, 그렇지 않으면 false를 리턴
		boolean result = isEven(num);
		System.out.println("isEven = " + result);
		
		// Ex2.
        int x = rand.nextInt(100);
        int y = rand.nextInt(100);
        System.out.println("x=" + x + ", y=" + y);
        
        int big = whoIsBig(x, y); // x, y 중 크거나 같은 수를 리턴.
        System.out.println("big=" + big);
        
        // Ex3.
        int code = rand.nextInt(1, 5);
        String gender = parseGenderCode(code); // 1 또는 3이면 "male", 2 또는 4이면 "female", 그 이외에는 "unknown"
        System.out.println("code=" + code + ", gender=" + gender);
	}
	
	/**
	 * argument로 전달된 정수가 짝수인지, 홀수인지를 리턴하는 메서드 
	 * @param num 정수(int). 짝수/홀수를 검사할 정수
	 * @return num이 짝수이면 true, 그렇지 않으면 false
	 */
	public static boolean isEven(int num) {
//		if(num % 2 == 0) {
//			return true;
//		} else {
//			return false;
//		}
		
//		boolean result = false;
//		
//		if(num % 2 == 0) {
//			result = true;
//		} else {
//			result = false;
//		}
//		
//		return result;
		
		return (num % 2 == 0) ? true : false;
	}
	
	/**
	 * 두 수 num1와 num2 중에서 크거나 같은 수를 리턴
	 * @param num1 정수(int). 크기를 비교할 정수
	 * @param num2 정수(int). 크기를 비교할 정수
	 * @return num1 > num2이면 num1, 그렇지 않으면 num2
	 */
	public static int whoIsBig(int num1, int num2) {
		return (num1 > num2) ? num1 : num2;
	}
	
	/**
	 * 성별 코드(정수)를 문자열로 변환해서 리턴 
	 * @param code 성별 코드. 1, 2, 3, 4
	 * @return 코드 값이 1 또는 3이면 "male", 코드 값이 2 또는 4이면 "female",
	 * 만약 그 이외의 코드 값인 경우에는 "unknown"을 리턴
	 */
	public static String parseGenderCode(int code) {
		if(code == 1 || code == 3) {
			return "male";
		} else if(code == 2 || code == 4) {
			return "female";
		} else {
			return "unknown";
		}
	}

}