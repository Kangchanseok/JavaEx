package com.javaex.api.objectclass.v3;

public class RectangleApp {

	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(6, 4);
		Rectangle b = new Rectangle(2, 12);
		Rectangle c = new Rectangle(3, 3);
		Rectangle d = c;
		// rectangle 클론 테스트
		Rectangle e = a.getClone();
		System.out.println("e = "+ e);
		e.w = 300;
		System.out.println(e);
		
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(d.equals(c));
		
		
		
		
		
		
		

	}

}
