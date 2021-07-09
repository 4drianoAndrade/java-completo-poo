package entities;

public class Rectangle {

	public double width;
	public double height;

	public double area() {

		return width * height;
	}

	public double perimeter() {

		return (width + height) * 2.0;
	}

	public double diagonal() {

		return Math.sqrt(Math.pow(width, 2.0) + Math.pow(height, 2.0));
	}
}
