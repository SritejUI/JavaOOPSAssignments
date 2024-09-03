class Shape {
	void print() {
		System.out.println("This is a shape");
	}
}

class Rectangle extends Shape {
	void print() {
		System.out.println("This is a rectangular shape");
	}
	void printShape() {
		super.print();
	}
}

class Circle extends Shape {
	void print() {
		System.out.println("This is a circular shape");
	}
}

class Square extends Rectangle {
	void print() {
		System.out.println("Square is a rectangle");
	}
	void printRectangle() {
		super.print();
	}
	void printShape() {
		super.printShape();
	}		
}

public class qs2_16 {
	public static void main(String[] args) {
		Square s = new Square();
		s.printRectangle();
		s.printShape();
	}
}