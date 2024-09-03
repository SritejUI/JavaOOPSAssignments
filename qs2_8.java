interface Vehicle {
	void engine();
	void speed();
	void price();
	void tyres();
}

class Cycle implements Vehicle {
	public void speed() {
		System.out.println("Avg speed of cycle is: 15kmph");
	}
	public void engine() {
		System.out.println("Cycle does not have a engine");
	}
	public void price() {
		System.out.println("Price of cycle is 12k");
	}
	public void tyres() {
		System.out.println("Cycles has 2 tyres");
	}
}

class Bike implements Vehicle {
	public void speed() {
		System.out.println("Avg speed of bike is: 60kmph");
	}
	public void engine() {
		System.out.println("Bike has 150cc engine");
	}
	public void price() {
		System.out.println("Price of bike is 1.2L");
	}
	public void tyres() {
		System.out.println("Bike has 2 tyres");
	}
}

class Car implements Vehicle {
	public void speed() {
		System.out.println("Avg speed of car is: 70kmph");
	}
	public void engine() {
		System.out.println("Car has 1498cc engine");
	}
	public void price() {
		System.out.println("Price of car is 20L");
	}
	public void tyres() {
		System.out.println("Car has 4 tyres");
	}
}

public class qs2_8 {
	public static void main(String[] args) {
		Vehicle c = new Cycle();
		c.engine();
		c.speed();
		c.price();
		c.tyres();

		c = new Bike();
		c.engine();
		c.speed();
		c.price();
		c.tyres();

		c = new Car();
		c.engine();
		c.speed();
		c.price();
		c.tyres();
	}
}