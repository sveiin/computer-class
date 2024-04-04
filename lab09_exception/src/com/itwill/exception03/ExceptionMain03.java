package com.itwill.exception03;

import java.util.Scanner;

public class ExceptionMain03 {
	
	private final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ExceptionMain03 app = new ExceptionMain03();
		
		int x = app.inputInteger2(); // app.inputInteger();
		System.out.println("x = " + x);

	}
	
	private int inputInteger() {
		int num = 0;
		
		while(true) {
			try {
				System.out.print("정수 입력> ");
				num = Integer.parseInt(sc.nextLine());
				break;
			} catch(NumberFormatException e) {
				System.out.println("입력한 값은 정수가 아닙니다\n");
			}
		}
		
		return num;
	}
	
	private int inputInteger2() {
		try {
			System.out.print("정수 입력> ");
			return Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("정수를 입력하세요\n");
			return inputInteger2(); // 재귀 호출
		}
	}

}
