package com.javaex.exception;
import java.util.Scanner;
import java.util.InputMismatchException;




import java.io.IOException; 

public class ExceptionEx {

	public static void main(String[] args) {
//		 arithExceptionEx();
//		 nullPointerExceptionEx();
//		 arrayIndexExceptionEx();
		 ThrowExceptEx();
		 
	}
	private static void ThrowExceptEx() {
		ThrowExcept except = new ThrowExcept();
		
				try {
					double result = except.divide(100,0);
					except.executeRuntimeException();
					// except의 executeException 메서드 내의 예외를 대신 처리
					except.executeException();
				} catch (CustomArithmeticException e ) {
					System.err.println(e.getMessage());
					System.err.printf("num1 : %d%N", e.getNum1());
					System.err.printf("num2 : %d%n", e.getNum2());
					
				}
				catch (ArithmeticException e) {
					System.err.println(e.getMessage());
					System.err.println("0으로 나눌 수 없습니다.");
					
							
				} catch (IOException e) { // checked exception 은 반드시 예외처리
					System.err.println(e.getMessage());
				
				} catch (RuntimeException e) {
					System.err.println(e.getMessage());
					
	
			}
				System.out.println("End of Code");
				
	}
	
	private static void arrayIndexExceptionEx() {
		// 배열의 인덱스 범위를 벗어난 접근
		int[] intArray = new int[] {1, 3, 5, 7, 9};
		// length == 5, 인덱스 범위 0~4 (length - 1)
		try {
			System.out.println(intArray[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 객체: " + e.getClass().getSimpleName());
			System.out.println("예외메시지: " + e.getMessage());
			System.out.printf("배열의 인덱스 범위는 0 ~ %d 까지 입니다%n",intArray.length - 1);
		}
			
			
		
		System.out.println("End of Code!");
		
	}
	
	private static void nullPointerExceptionEx() {
		String str = new String("Java");
		System.out.println(str.toUpperCase());
		str = null; // 참조 해제
		System.out.println(str);
		
		try {
			System.out.println(str.toUpperCase());
		} 
		catch (NullPointerException e){
			System.err.println("srt은 null입니다!");
		}
		System.out.println("End of Code");
		
				
	}
	
	private static void arithExceptionEx() {
		
		// 스캐너로부터 정수 입력
		// 100 을 입력받은 정소로 나눈다
		double result = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		
		
		try {
			// 예외 발생 가능 코드를 명시
		num = sc.nextInt();
		result = 100 / num;
		}
		catch (InputMismatchException e) {
			System.err.println("정수로 입력해 주세용~!");
		}
		catch (ArithmeticException e) {
			System.err.println("0으로는 나눌 수 없어용~!");
			
		}
		catch (Exception e) {
			e.printStackTrace(); // 예외 정보 전체를 출력
		}
		finally {
			// 예외 여부 관계 없이 가장 마지막에 수행
			System.out.println("Finally");
		}
			
			
			System.out.println(result);
			sc.close();
		
		
	}
}
