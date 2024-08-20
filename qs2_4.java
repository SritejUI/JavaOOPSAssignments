class Company {
	String name;
	int netVal;
	
	Company(String name, int netVal) {
		this.name = name;
		this.netVal = netVal;
	}

	void print() {
		System.out.println("Hello");
	
	} 
}

class Office extends Company {
	String location;
	int branches;
	Office(String name, int netVal, String location, int branches) {	
		super(name, netVal);
		this.location = location;
		this.branches = branches;
	}

	void print() {
		System.out.println("Company name: " + name);
		System.out.println("Net Value: " + netVal);
 		System.out.println("Location: " + location);
		System.out.println("Branches: " + branches);
	}
}

class qs2_4 {
	public static void main(String[] args) {	
		Company c = new Office("Google", 10000000, "San Francisco", 546);
		c.print();
	}
}