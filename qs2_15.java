import java.util.Scanner;

class Rectangle {
	int length;	
	int breadth;
	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	int Perimeter() {
		return 2*(length + breadth);
	}
	int Area() {
		return length*breadth;
	}
}

class Square extends Rectangle {
	Square(int s){
		super(s,s);
	}
}

public class qs2_15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Square[] boxes = new Square[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Length of side of block: ");
			boxes[i] = new Square(in.nextInt());
			System.out.println("Area of box " + (i + 1) + " is: " + boxes[i].Area());
		} 
	}
}
	