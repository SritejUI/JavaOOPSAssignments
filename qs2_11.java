class Super {
	void Method1() {
		System.out.println("This is superclass method");
	}
}

class Sub extends Super {
	void Method2() {
		System.out.println("This is subclass method");
	}
	void superMethod() {
		super.Method1();
	}
}
public class qs2_11 {
	public static void main(String[] args) {
		Super s = new Super();
		s.Method1();
		Sub s2 = new Sub();
		s2.Method2();
		s2.superMethod();
	}
}