import addition.Addition;
import multiplication.Multiplication;
import division.Division;
import subtraction.Subtraction;
import java.util.Scanner;

public class qs2_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Addition addition = new Addition();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();
        Subtraction subtraction = new Subtraction();

        System.out.println("Calculator Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + addition.add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + subtraction.subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + multiplication.multiply(num1, num2));
                break;
            case 4:
                double result = division.divide(num1, num2);
                if (num2 != 0) {
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }

    }
}
