package com.itwill.loop06;

public class LoopMain06 {

	public static void main(String[] args) {
		// 중첩 반복문: 반복문 안에서 반복문을 사용
		// 구구단 2단 ~ 9단까지 출력
		for(int i = 2; i < 10; i++) {
			System.out.println("----- " + i + "단 -----");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println("---------------");
		}

	}

}
