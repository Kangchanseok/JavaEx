package com.javaex.basics;
import java.util.Scanner;




		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("원섭: ");
		System.out.println("세희: ");
		System.out.println("상근: ");
		System.out.println("숭이: ");
		System.out.println("강수: ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int d= sc.nextInt();
		int e= sc.nextInt();
		if (a < 40) {
			System.out.println(40);
			
	} else {
		System.out.println(a);
	}
		if (b < 40) {
			System.out.println(40);
			
	} else {
		System.out.println(b);
	}	
		if (c < 40) {
			System.out.println(40);
			
	} else {
		System.out.println(c);
	}
		if (d < 40) {
			System.out.println(40);
			
	} else {
		System.out.println(d);
	}
		if (e < 40) {
			System.out.println(40);
			
	} else {
		System.out.println(e);
	}
		
		System.out.println((a+b+c+d+e)/5);
		*/
	
		/*Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		for (int i = 0; i<5; i++){
				
		int val = sc.nextInt();
		
		sum += val >40 ? val : 40;
		
		
		
		
	}
	
		System.out.println(sum/5);
		

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if (C - B <= 0) {
			System.out.println("-1");
			
		}
		else {
			System.out.println(A/(C-B)+1);
			
		}
		
		
		*/
public class Main {

	public static void main(String[] args) {
		int a =0;
		while (a < 100) {
			a++;
					
		if ((a % 3 == 0) && (a % 5 == 0)) {
				System.out.println("FizzBuzz");
			}
		else if (a % 3 == 0) {
				System.out.println("Fizz");
			}	
		else if (a % 5 == 0) {
			System.out.println("Buzz");
		}
		
		else 
			System.out.println(a);
		
		

		
		
		}
	}
	}




