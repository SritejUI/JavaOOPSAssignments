final class Circle {
	final float PI = 3.14f;
	float radius;
	Circle(float radius) {
		this.radius = radius;
	}
	final float Area() {
		return PI*radius*radius;
	}
}

public class qs2_6 {
	public static void main(String[] args) {
		Circle c = new Circle(3f);
		System.out.println("Area of circle is: " + c.Area());
	}
}