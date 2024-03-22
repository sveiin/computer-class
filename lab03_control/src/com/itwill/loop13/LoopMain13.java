package com.itwill.loop13;

public class LoopMain13 {

	public static void main(String[] args) {
		/* 교재 연습문제 5
        출력 결과
        *
        **
        ***
        ****
      */
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		/* 교재 연습문제 6
        출력 결과
            *
           **
          ***
         ****
      */
		
		// 1.
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4 - i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 2.
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				if(j <= 4 - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 3.
		for(int i = 1; i <= 4; i++) {
			for(int j = 4; j >= 1; j--) {
				if(j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}