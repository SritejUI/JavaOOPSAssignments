import mypack2.Fruits;

class Mango extends Fruits {
	Mango(String color, int price) {
		this.color = color;
		this.price = price;
	}

	public void details() {
		System.out.println("Color of Mango is: " + color);
		System.out.println("Price of Mango is: " + price);
	}
}

class Apple extends Fruits {
	Apple(String color, int price) {
		this.color = color;
		this.price = price;
	}

	public void details() {
		System.out.println("Color of Apple is: " + color);
		System.out.println("Price of Apple is: " + price);
	}
}

class qs2_1 {
	public static void main(String[] args) {
		Mango m = new Mango("yellow", 30);
		Apple a = new Apple("red", 50);
		m.details();
		a.details();
	}
}