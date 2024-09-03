import java.util.Scanner;

class qs2_17 {
	static int Sum(int ...x) {
		int sum = 0;
		for(int j : x) {
			sum = sum + j;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Enter the numbers you want to add: ");
		n = in.nextInt();
		System.out.println("Enter the numbers you want to add: ");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("The sum of elements is: " + Sum(arr) );
	}
}