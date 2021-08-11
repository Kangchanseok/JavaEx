package com.javaex.basics;

public class OperatorEx {

	public static void main(String[] args) {
		
		
		arithOperEx();
		logicOperEx();
		bitOperEx();
		bitShiftOperEx();
		conditionalOperEx();
		
		
		
		
		
		
	}		
			// 비트 시프트 연산자
		private static void bitShiftOperEx() {
			
		
			// 비트 단위로 이동
			int val = 1;
			System.out.println(val);
			System.out.println(Integer.toBinaryString(val << 1)); // 왼쪽 1비트 이동
			System.out.println(Integer.toBinaryString(val << 4)); // 왼쪽4비트 이동
			
			System.out.println(Integer.toBinaryString(2021));
			
			val = -2021;
			System.out.println(Integer.toBinaryString(val));
			System.out.println(Integer.toBinaryString(val >> 2));
			System.out.println(Integer.toBinaryString(val >>> 2));
			
			
			
			
		}	
			
			// 3항 연산자
		private static void conditionalOperEx()   {
			// 문법 -> 조건식 ? 참일 때의 값 또는 식 : 거짓일 때의 값 또는 식;
			int a = 10;
			
			String result;
			// a가 짝수이면 "짝수"로 홀수면 "홀수"로 출력
			result = a % 2 == 0 ? "짝수" : "홀수" ;
			System.out.println(a + " 은/는 " + result);
			
			int score = 45;
			// 만약에 score 가 80 이상이면 good
			// score 가 50점 이상이면 pass
			// score 가 50점 미만이면 fail
			String message = score >= 80 ? "good" : 
					          score >= 50 ? "pass" : "fail";
					          
			
			System.out.println("score:" + score + " 결과:" + message);
			
			
		
			
			
			
			
		}
		
		
		
			//비트 연산자
		private static void bitOperEx() {
			// 하드웨어 제어, 이미지 처리 등
			//미세하게 비트 단위 데이터 저어에 활용
			byte b1 = 0b1101;
			byte b2 = 0b0111;
			
			
			
			
			System.out.println("b1:" + Integer.toBinaryString(b1));
			System.out.println("b2:" + Integer.toBinaryString(b2));
			
			int result = b1 & b2; // 비트 논리곱
			System.out.println("b1 & b2 : " + Integer.toBinaryString(result));
			
			result = b1 | b2; // 비트 논리합
			System.out.println("b1 | b2 : " + Integer.toBinaryString(result) );
			
			result = ~b1; // 비트 논리 부정
			System.out.println("~b1 : " + Integer.toBinaryString(result));
			
			result = b1 ^ b2; // 배타적 논리합 : 서로가 서로를 배척, 비트가 같으면 0 다르면 1을 출력함
			System.out.println("b1 ^ b2 :" + Integer.toBinaryString(result));
			
			
			
				
			
			
			
			
			
		}
		
			// 비교 연산과 논리 연산
		private static void logicOperEx() {
			int a = 7, b = 3;
			//비교 연산자 : >, >=, <, <=, ==(같다), !=(같지않다)
			System.out.println("a>b?" + (a>b));
			System.out.println("a와 b가 같습니까?" + (a==b));
			System.out.println("a와 b가 다릅니까?"+ (a!=b));
			
			//논리 연산자 : 논리곱(AND: &&), 논리합(OR: ||)
			int num = 5;
			// num: 0초과 10미만의 값인가?
			// 조건1: num > 0
			// 조건2: num < 10
			// 결과 : 조건1 and 조건2(논리곱)
			boolean r1 = num > 0;
			boolean r2 = num <10;
			boolean r1Andr2 = r1 && r2;
			// num > 0 && num < 10
			System.out.println("r1 && r2 => " + r1Andr2);
			
			// num : 0이하이거나 10이상의 값인가?
			// 조건1: num <= 0
			// 조건2: num >= 10
			// 결과 : 조건1 or 조건2(논리합)
			boolean r3 = num <=0;
			boolean r4 = num >=10;
			boolean r3Orr4 = r3 || r4;
			// num <= 0 || num >= 10
			System.out.println("r3 || r4 => " + r3Orr4);
			
			// 논리 부정 : 
			// num > 0 && num < 10 ->논리부정하면 밑에껄로 됨
			// num <= 0 || num >= 10
			boolean rNot = !(num > 0 && num < 10);
			System.out.println("num가 0초과, 10미만 이외의 값인가?" + rNot);
			
					
		
		}
		
		
		
	
	
	
	
	        // 산술 연산
		private static void arithOperEx() {
			int a = 7, b = 3;
			
			// 부호 연산자: +, -
			System.out.println(-a);
			
			// 사칙연산
			System.out.println(a / b);
			System.out.println(a % b);
			
			// 실제 해 구하기
			System.out.println((float)a / (float)b);
			System.out.println((float)a / b);
			 
			// 전치증감
			int num = 10;
			System.out.println("num" + num);
			System.out.println("++num" + ++num);
			System.out.println("num" + num);
			
			// 후치증감
			System.out.println("num" + num);
			System.out.println("++num" + num++);
			System.out.println("num" + num);
			
			// 나눗셈 보충
			//System.out.println(4 / 0); ArithmeticException 0으론 못나눔!
			System.out.println(4.0 / 0); // 얘는  Infinity로 나옴
			System.out.println(4.0 / 0 + 10); // Infinity 포함된 연산은 항상 Infinity로 나옴
			System.out.println(0.0 / 0.0); // Not a Number (NaN)
			
			//우리의 연산식 결과가 Infinity인지 확인
			System.out.println(Double.isInfinite(4.0 / 0 ));// 인피니티면 true
			System.out.println(Double.isNaN(0.0 / 0.0)); // nan이면 true
			
			
			System.out.println("End of Code");
			
			
		
		
		}
}





		
		
		
		
		
		
		
		
		
		
		
		
		
		


