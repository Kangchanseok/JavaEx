package com.javaex.api.objectclass.v1;

// v1. 모든 클래스의 최상의 부모는 Object
// toString: 객체를 문자열로 출력할 때 호출되는 메서드
// public class Point extends java.lang.Object 랑 똑같음
public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	@Override
	public String toString() {
		// 객체 출력 포맷을 리턴
		return String.format("Point(%d, %d)%n", x, y);
		
				
	}
}
