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

public class qs2_14 {
	public static void main(String[] args) {
		Square s = new Square(10);
		System.out.println("The Perimeter of the square is: " + s.Perimeter());
		System.out.println("The Area of the square is: " + s.Area());
	}
}
		