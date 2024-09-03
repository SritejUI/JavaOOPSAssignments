class Super {
	int x = 100;
	int y;
	Super(int y) {
		this.y = y;
		System.out.println("Superclass Constructor");
	}
	void Method() {
		System.out.println("This is Superclass method");
	}
}

class Sub extends Super {
	int x = 15;
	int a = super.x;
	Sub(int y) {
		super(y);
		System.out.println("Subclass Constructor");
	}
	void Method() {
		super.Method();
	}
}

public class qs2_5 {
	public static void main(String[] args) {
		Sub s = new Sub(10);
		System.out.println(s.x);
		System.out.println(s.a);
		s.Method();
	}
}
	