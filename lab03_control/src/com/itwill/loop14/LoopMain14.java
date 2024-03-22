package com.itwill.loop14;

import java.util.Scanner;

public class LoopMain14 {

	public static void main(String[] args) {
		// 교재 연습문제 7
		boolean run = true; // 프로그램을 계속 실행할 지, 종료할 지를 결정하기 위한 변수
		int balance = 0; // 은행 계좌의 잔고를 저장하기 위한 변수
		Scanner scanner = new Scanner(System.in); // 콘솔 입력을 위해서 필요

		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				// 입금 기능 구현
				System.out.print("예금액> ");
				int money = scanner.nextInt();
				balance += money;
			} else if(choice == 2) {
				// 출금 기능 구현
				System.out.print("출금액> ");
				int money = scanner.nextInt();
				balance -= money;
			} else if(choice == 3) {
				// 잔고 확인 기능 구현
				System.out.print("잔고> " + balance +"\n");
			} else if(choice == 4) {
				// 프로그램 종료
				run = false;
			}
			System.out.println();
			
//			switch (choice) {
//            case 1:
//                System.out.print("입금액>> ");
//                int deposit = scanner.nextInt();
//                balance += deposit;
//                System.out.printf("입금: %d, 잔고: %d\n", deposit, balance);
//                break;
//            case 2:
//                System.out.print("출금액>> ");
//                int withdraw = scanner.nextInt();
//                balance -= withdraw;
//                System.out.printf("출금: %d, 잔고: %d\n", withdraw, balance);
//                break;
//            case 3:
//                System.out.println("잔고: " + balance);
//                break;
//            case 4:
//                run = false; // while 문을 종료하기 위한 조건 변경
//                System.out.println("안녕히 가세요~");
//                break; // switch 문장을 종료
//            default:
//                System.out.println("1~4 중에서 선택하세요!");
//            }

			// switch문 안에서는 케이스가 달라도 같은 이름으로 변수 선언 불가
		}
		
		System.out.println("프로그램 종료");

	}

}