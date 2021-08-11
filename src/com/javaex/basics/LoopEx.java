package com.javaex.basics;
import java.util.Scanner;



public class LoopEx {

	public static void main(String[] args) {
		
		//whileEx();
				//whileGugu();
		//doWhileEx();
		//forGugu();
		//continueEx();
		//ex01();
		//ex02();
		//problem1();
		breakEx();
		
		
		
		
		System.out.println("End of Code");
		
		

	}
	private static void breakEx() {
		int a = 1;
		
		while(true) {
			if (a % 6 == 0 && a % 14 == 0)
				break;
			a++;
			System.out.println(a);
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	private static void problem1() {
		int a = 1;
		for (a = 1; a <= 100; a++) {
			if(a % 5 == 0 && a % 7 == 0)
				System.out.println(a);
			
				}
				
		}
	
		
		
	
	private static void ex01() {
		
		int dan = 2;
				
		for(dan = 2; dan <= 9; dan++)
		for(int i = 1; i <=9; i++ ) {
			System.out.println(dan + "*" + i + "=" + (dan * i) );
			
		}
		
		
		
	}
	
	
		
	private static void ex02() {
		
		for(int i=1; i<=6; i++) {
	         for(int j=1; j<=i; j++) {
	            System.out.print("*");
	            if(j==i) {
	               System.out.println();
	            }
	            
	         }
	      }
	   }	
	
			
				
		
		
	
		
		
		
		
				
				
				
		
		
		
		
	
	
	
	
	
	private static void continueEx() {
		for (int i = 1; i <= 20; i++) {
			// 2의 배수, 3의 배수는 출력하지 않음
			if (i % 2 == 0 || i % 3 == 0)
				continue;
			
			System.out.println(i);
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	

	private static void forGugu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력하세요");
		int dan = sc.nextInt();
		
		for(int i = 1; i<= 9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
					}
			sc.close();
			
		
		
		
		
		
	}
	
	
	
	
	private static void doWhileEx() {
		
		int total = 0, value = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("숫자를 입력하세요.[0이면 종료]");
			value = sc.nextInt();
			total += value; // total = total + value	
		} while (value != 0);
		
		System.out.println("합계: " + total);
		sc.close();
		
		
		
	}
	
	
	
	
	private static void whileGugu() {
		
		Scanner sc= new Scanner(System.in);
		int dan; 
		int i = 1;
		
				System.out.println("단을 입력하세요");
		System.out.println("단 :");
		dan = sc.nextInt();
		
		while (i<=9) {
			System.out.println(dan + "*" + i +  "=" + (dan * i));
			
			
			i++;
			
			sc.close();
						
		}
				
	
	
			
		
	}
	
		
	private static void whileEx() {
		int num = 0; // 반복 조건 제어 변수
		
		
				
		
		while (num <= 9) {
		System.out.println("I Like Java" + num);
		num++;
		
		}
		
		
		
	}
}
