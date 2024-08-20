class Phone {
	String brand;
	int year;
	
	Phone(String brand, int year) {
		this.brand = brand;
		this.year = year;
	}
}

class Iphone extends Phone {
	String os;
	int memory;
	
	Iphone(String brand, int year, String os, int memory) {
		super(brand , year);
		this.os = os;
		this.memory = memory;
		System.out.println("This is Iphone Constructor");
	}

	void specs() {
		System.out.println("Iphone was found in: " + year);
		System.out.println("Iphone runs on: " + os);
		System.out.println("Maximum memory offered by Iphone: " + memory);
	}
}

class IphoneX extends Iphone{
	IphoneX(String brand, int year, String os, int memory) {
		super(brand , year, os, memory);
		System.out.println("IphoneX object created");
	}


	void specs() {
		System.out.println("IphoneX was found in: " + year);
		System.out.println("IphoneX runs on: " + os);
		System.out.println("Maximum memory offered by IphoneX: " + memory);
	}
}

class qs2_2 {
	public static void main(String[] args) {
		IphoneX ip = new IphoneX("Iphone",2017,"iOS 18",256);
		ip.specs();
	}
}