import java.util.Scanner;

class DoubleDigitException extends Exception {
	public String toString() {
		return "USER DEFINED ERROR";
	}
}

class SpecialNumberException extends Exception {
	public String toString() {
		return "USER DEFINED ERROR";
	}
}

public class qs3_1 {
	
	static void doubleDigit(int x) throws DoubleDigitException {
		if(x >= 100 || x <= 9) {
			throw new DoubleDigitException();
		}
	}
	
	static void specialNumber(int x) throws SpecialNumberException {
		int sum = 0;
		int product = 1;
		int temp = x;
		while (temp > 0) {
			int r = temp % 10;
			sum += r;
			product *= r;
			temp /= 10;
		}
		if ((sum + product) != x) {
			throw new SpecialNumberException();
		}
	}			
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x; 
		System.out.print("Enter a two digit number here: ");
		try {
			x = sc.nextInt();
			doubleDigit(x);
			specialNumber(x);
			System.out.println("The given number is a special number");
		}
		catch(DoubleDigitException e) {
			System.out.println("The given number is not a two digit number");
		}
		catch(SpecialNumberException e) {
			System.out.println("The given number is not a special number");
		}
	}
}
		