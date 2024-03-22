package com.itwill.loop12;

import java.util.Random;

public class LoopMain12 {

	public static void main(String[] args) {
		// ctrl + shift + F 코드 정리
		
		// 교재 연습문제 3
		// 주사위 2개를 던졌을 때 결과를 (x, y) 형식으로 출력
		// 주사위 2개의 눈의 합이 5가 되면 실행을 멈춤
		// (1, 2), (6, 2), ..., (2, 3)
		
		Random rand = new Random();

		while (true) {
			int dice1 = rand.nextInt(1, 7);
			int dice2 = rand.nextInt(1, 7);
			int sum = dice1 + dice2;

			System.out.printf("(%d, %d)", dice1, dice2);
			if (sum == 5) {
				break;
			} else {
				System.out.print(", ");
			} 
		}
		System.out.println();

		// 교재 연습문제 4
		// 4x + 5y = 60 방정식을 만족하는 x와 y를 찾기
		// 단, x와 y는 10 이하의 자연수(1, 2, 3, ..., 9, 10)
		// (x=5, y=8), ...
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if ((4 * i) + (5 * j) == 60) {
					System.out.printf("(x=%d, y=%d), ", i, j);
				}

			}
		}

	}

}