package com.itwill.loop11;

public class LoopMain11 {

	public static void main(String[] args) {
		// Ex1. 1부터 10까지 자연수들의 합을 계산하고 출력
		// 1 + 2 + 3 + ... + 9 + 10 = 55
		int i = 1;
		int sum = 0;
		while(i <= 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		// Ex2. 1부터 100까지 자연수들 중에서 짝수들의 합을 계산하고 출력
		// 2 + 4 + 6 + ... + 98 + 100 = ?
		i = 2;
		sum = 0;
		while(i <= 100) {
			sum += i;
			i += 2;
		}
		System.out.println(sum);
		
		// Ex3. 1부터 100까지 자연수들 중에서 홀수들의 합을 계산하고 출력
		// 1 + 3 + 5 + ... + 97 + 99 = ?
		i = 1;
		sum = 0;
		while(i <= 100) {
			sum += i;
			i += 2;
		}
		System.out.println(sum);
	}

}
