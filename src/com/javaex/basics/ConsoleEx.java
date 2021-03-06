package com.javaex.basics;

import java.util.Scanner; // java.util 패키지의 Scanner 로드 하는 과정


public class ConsoleEx {

	public static void main(String[] args) {
		
		
		consoleOutputEx();
		consoleInputEx();
		consoleInputPractice();
		

	}
	private static void consoleInputPractice() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력해 주세요.");
		System.out.print("이름:");
		String name = scanner.next();
		System.out.print("나이:");
		int age = scanner.nextInt();
		
		
		
		System.out.println("당신의 이름은 " + name + ", 나이는 " + age + "입니다.");
				
		scanner.close();
		
		
				
		
		
		
		
	}
	private static void consoleInputEx() {
		// 표준 입력 : stdin -> System.in
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		System.out.println("이름:");
				
		String name = scanner.next();
		System.out.println("당신의 이름은 " + name + "입니다.");
		
		// 중요 : 시스템 자원을 사용하는 클래스는 사용 이후 반드시 닫아줘야함!!!!!!!
		scanner.close();
		
		
		
		
	}
	
	
	private static void consoleOutputEx() {
		
		// 표준 출력 : stdout -> System.out
		// 표준 에러 : stderr -> System.err
		
		
		// 출력 메서드
		// print : 개행 안함
		// println : 개항 한다 -> print \n
		// printf : 형식화 된 출력 -> String
		
		System.out.print("Hello "); // 개행 안한다
		System.out.println("Java"); // 개행 한다
		
		// 이스케이프 문자 \ -> 특수한 의미를 지닌 문자
		System.out.println("Hello \tJava"); // \t : 탭
		System.out.println("Hello \nJava");// \n : 개행
		System.out.println("그는 말했다 \"안뇽\""); // \" 큰따옴표 쓸 때
		System.out.println("C:\\users\\bit..."); // \\ 역슬래쉬 쓸 때
		
		System.err.println("표준 에러 출력!");
		
		
		
		
		
	}
}
