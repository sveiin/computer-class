package com.itwill.loop05;

public class LoopMain05 {

	public static void main(String[] args) {
		// 반복문에서 break와 continue 문장
		
		// 1. break: 반복문 블록을 실행하는 중에 break 문장을 만나면,
		// break가 포함된 가장 가까운 반복문 블록을 끝냄
		for(int i = 0; i < 5; i++) {
			if(i == 3) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("----------------");
		
		// 2. continue: 반복문 블록을 실행하는 중에 continue 문장을 만나면, 
		// continue 아래의 코드들은 실행하지 않고, 그 다음 반복 과정을 계속 수행
		
		for(int i = 0; i < 5; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("----------------");
		
		// break 문장의 용도: 무한 반복문 실행 중에 특정 조건을 만족하면 반복문을 종료
		for(int i = 1; ; i++) {
			System.out.println(i);
			if(i == 5) {
				break;
			}
		}
	}

}
