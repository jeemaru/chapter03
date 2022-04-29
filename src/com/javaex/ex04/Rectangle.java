package com.javaex.ex04;

public class Rectangle {

	private int width;
	private int height;
	
	
	public Rectangle() {
		super();
	}
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public boolean equals(Object rec) {
		Rectangle r = (Rectangle) rec;
		if(this.width==r.width && this.height==r.height) {
			return true;
		}
		return false;
	}
	
}
