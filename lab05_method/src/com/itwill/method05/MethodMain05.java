package com.itwill.method05;

public class MethodMain05 {

	public static void main(String[] args) {
		// 메서드 선언, 호출, 그 결과를 출력
		
		int[] arr = { 5, 8, 13, 1, 9, 4};
		
		System.out.println(sum(arr));
		System.out.println(avg(arr));
		System.out.println(max(arr));
		System.out.println(min(arr));
	}
	
	/**
	 * sum
	 * argument로 전달받은 정수들의 1차원 배열의 모든 원소들의 합을 리턴
	 * @param array 정수들의 1차원 배열(int[])
	 * @return array의 모든 원소들의 합
	 */
	 public static int sum(int[] array) {
		 int sum = 0; // 자바에서는 메서드 이름과 지역 변수의 이름이 동일해도 문제 없음
		 
		 for(int i = 0; i < array.length; i++) {
			 sum += array[i];
		 }
		 
		 return sum;
	 }
	 
	 /**
	  * avg
	  * argument로 전달받은 정수들의 1차원 배열 원소들의 평균을 리턴
	  * @param array 정수들의 1차원 배열
	  * @return array 원소들의 평균을 double 타입으로 리턴
	  */
	 public static double avg(int[] array) {
		 double avg = (double) sum(array) / array.length;
		 
		 return avg;
	 }
	 
	 /**
	  * max
	  * argument로 전달받은 정수들의 1차원 배열 원소들 중 최댓값을 리턴
	  * @param array 정수들의 1차원 배열
	  * @return array 원소들 중 최댓값
	  */
	 public static int max(int[] array) {
		 int max = array[0];
		 
		 for(int i = 0; i < array.length; i++) {
			 if(array[i] > max) {
				 max = array[i];
			 }
		 }

		 return max;
	 }
	 
	 /**
	  * min
	  * argument로 전달받은 정수들의 1차원 배열 원소들 중 최솟값을 리턴
	  * @param array 정수들의 1차원 배열
	  * @return array 원소들 중 최솟값
	  */
	 public static int min(int[] array) {
		 int min = array[0];
		 
		 for(int i = 0; i < array.length; i++) {
			 if(array[i] < min) {
				 min = array[i];
			 }
		 }

		 return min;
	 }
	 
}
