package com.javaex.oop.point.v1;

public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.getX();
		p1.setX(25);
		p1.setY(35);
		p1.draw();
		
		Point p2 = new Point();
		p2.setX(45);
		p2.setY(55);
		p2.draw();
		
		

	}

}
