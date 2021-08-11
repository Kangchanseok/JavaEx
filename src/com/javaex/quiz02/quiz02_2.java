package com.javaex.quiz02;

public class quiz02_2 {

	public static void main(String[] args) {
		
		
		conditionalOperEx();
		
		

	}

	
	
	
	private static void conditionalOperEx() {
		
		
		int balls = 136;
		int cap = 10;
		
		int count = balls / cap;
		int count1 = balls % cap;
		
		System.out.println(count);
		System.out.println(count1);
		
		count += count1 > 0 ? 1: 0 ;
		
				
		
				
				
		
		
	}
}
