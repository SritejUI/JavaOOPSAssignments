class Super {
	Super() {
		System.out.println("Superclass constructor");
	}
	void Method() {
		System.out.println("Superclass Method");
	}
}

class Sub extends Super {
	Sub() {
		System.out.println("Superclass constructor");
	}
	void Method() {
		System.out.println("Subclass Method");
	}
}

public class qs2_7 {
	public static void main(String[] args) {
		Super s = new Sub();
		s.Method();
	}
}