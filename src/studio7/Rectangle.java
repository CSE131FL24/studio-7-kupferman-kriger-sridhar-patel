package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	private double area;
	private double perimeter;
	private boolean isSquare;
	
	public Rectangle(double len, double wid) {
		length = len;
		width = wid;
		area = len * wid;
		perimeter = 2 * len + 2* wid;
		isSquare = len == wid;
	}
	public void drawRectangle() {
		StdDraw.setXscale(0, 20);
        StdDraw.setYscale(0, 20);
		StdDraw.clear();
        StdDraw.setPenColor(Color.BLACK);
        StdDraw.filledRectangle(10, 10, width / 2.0, length / 2.0);
        StdDraw.show();
	}
	
	public boolean isSquare() {
		return isSquare;
	}
	public boolean isBigger(Rectangle rec) {
		if(area > rec.area) return true;
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(5, 10);
		
		Rectangle r2 = new Rectangle(6, 6);
		System.out.println(r1.isBigger(r2));
		r1.drawRectangle();
		System.out.println(r1.isSquare());
	}

}
