package com.itwill.loop02;

public class LoopMain02 {

	public static void main(String[] args) {
		// 5 4 3 2 1 출력
		for(int i = 5; i > 0; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println(); // 줄바꿈

		// 0 2 4 6 8 10 출력
		for(int i = 0; i <= 10; i += 2) { // i = i + 2
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 0; i <= 5; i++) {
			System.out.print((i * 2) + " ");
		}
		System.out.println();
	
		for(int i = 0; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// 10 8 6 4 2 0 출력
		for(int i = 10; i >= 0; i -= 2) { // i = i - 2 
			System.out.print(i + " ");
		}
	}

}
