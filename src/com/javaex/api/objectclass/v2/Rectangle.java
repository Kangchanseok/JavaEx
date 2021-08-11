package com.javaex.api.objectclass.v2;

public class Rectangle {

	
	
	
	private int w;
	private int h;
	
	
	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
		
		
		
	}
	

	@Override
	public String toString() {
		return "Rectangle [w=" + w + ", h=" + h + "]";
	}
// 우클릭 해서 source - generate toString 

	@Override
	public boolean equals(Object o) {
		if (o instanceof Rectangle) {
			Rectangle r = (Rectangle)o;
			return (w * h == r.w * r.h);
			
			
			
			
		}
		return super.equals(o);
	}
	
	
	
}
