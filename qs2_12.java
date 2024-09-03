class Super {
	private void Method1() {
		System.out.println("This is superclass method");
	}
	void getMethod() {
		Method1();
	}
}

class Sub extends Super {
	void Method2() {
		System.out.println("This is subclass method");
	}
	void superMethod() {
		super.getMethod();
	}
}
public class qs2_12 {
	public static void main(String[] args) {
		Super s = new Super();
		s.getMethod();
		Sub s2 = new Sub();
		s2.Method2();
		s2.superMethod();
	}
}