import java.util.Scanner;

class Shape {
    public String name;
    public Shape (String s) {
        name = s;
    }

    public String getName() {
        return name;
    }
}

class Circle extends Shape {
    public double radius;
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public void calculate() {
        System.out.println("Area is of Circle is: " + 3.14*radius*radius);
    }
}

class Cylinder extends Circle {
    public double height;
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        name = "Cylinder";
    }

    public void calculate() {
        System.out.println("Area of Cylinder is: " + 6.28*radius*(radius + height));
    }
}

public class qs8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.println("Enter height: ");
        double height = sc.nextDouble();

        Circle c = new Circle(radius);
        Cylinder c2 = new Cylinder(radius , height);

        c.calculate();
        c2.calculate();
    }
}

