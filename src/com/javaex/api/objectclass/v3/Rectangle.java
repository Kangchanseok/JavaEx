package com.javaex.api.objectclass.v3;

public class Rectangle implements Cloneable {

	
	 int w;
	 int h;
	

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
	public Rectangle getClone() {
		Rectangle clone = null;
		try {
			clone = (Rectangle)clone();
			
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
		
		}
		
	}
	
	

