package Polymorphism;


abstract class Shape {
	String colour;
	double borderWidth;
	private double Area;
	
	abstract double area();

	Shape() {
		super();
		this.colour = "Red";
		this.borderWidth = 5.7;
		System.out.println("Default shape constructor");
	 }

	Shape(String colour, double borderWidth) {
		super();
		this.colour = colour;
		this.borderWidth = borderWidth;
		System.out.println("parameterized shape constructor");
	 }

	String getColour() {
		return colour;
	}

	void setColour(String colour) {
		this.colour = colour;
	}

	double getBorderWidth() {
		return borderWidth;
	}

	void setBorderWidth(double borderWidth) {
		this.borderWidth = borderWidth;
	}
	
	double calarea() {
		return Area;
	}

	void display() {
		System.out.println("colour is: " + this.colour);
		System.out.println("Borderwidth Is: " + this.borderWidth);
	}

} // class Shape Ends here

abstract class Circle extends Shape {
	double radius;

	Circle() {
		super();
		this.radius = 5.3;
		System.out.println("Defult circle constructor");
	}

	Circle(String colour, double borderwidth, double radius) {
		super();
		this.radius = radius;
		System.out.println("parameterized circle constructor");
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}

	double calarea() {
		return radius*radius;
	}
	
	void display() {
		super.display();
		System.out.println("Radius is: " + this.radius);

	}

} // class circle ends here

abstract class Rectangle extends Shape {
	double length;
	double height;

	Rectangle() {
		super();
		this.length = 2.5;
		this.height = 2.5;
		System.out.println("Defult Rectangle constructor");
	}

	Rectangle(String colour, double borderwidth, double length, double height) {
		super();
		this.length = length;
		this.height = height;
		System.out.println("Parametrized Rectangle constructor");
	}

	double getLength() {
		return length;
	}

	void setLength(double length) {
		this.length = length;
	}

	double getHeight() {
		return height;
	}

	void setHeight(double height) {
		this.height = height;
	}
	
	double calarea() {
		return length*height;
	}

	void display() {
		super.display();
		System.out.println("Length is: " + this.length);
		System.out.println("Height is: " + this.height);
	}

} // class Rectangle Ends here

abstract class Triangle extends Shape {
	double base;
	double height;

	Triangle() {
		super();
		this.base = 2.5;
		this.height = 2.4;
		System.out.println("Defult Triangle constructor");
	}

	Triangle(String colour, double borderwidth, double base, double height) {
		super(colour, borderwidth);
		this.base = base;
		this.height = height;
		System.out.println("Parameterized Triangle constructor");
	}

	double getBase() {
		return base;
	}

	void setBase(double base) {
		this.base = base;
	}

	double getHeight() {
		return height;
	}

	void setHeight(double height) {
		this.height = height;
	}
	
	double calarea() {
		return base * height;
	}

	void display() {
		super.display();
		System.out.println("Base is: " + this.base);
		System.out.println("Height is: " + this.height);
	}

} // class triangle ends here

class TestShape {
	public static void main(String[] args) {
	    c1 = new Circle();
		c1.display();
		System.out.println();

		Rectangle r1 = new Rectangle();
		r1.display();

		Triangle t1 = new Triangle();
		t1.display();
		System.out.println();
		
		s1.calarea();
		c1.calarea();
		r1.calarea();
		t1.calarea();

	}
}