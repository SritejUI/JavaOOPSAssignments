import java.util.Scanner;

class qs6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of elements in array: ");
        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter sum of digits desired: ");
        int k = sc.nextInt();
        int min = n;

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            while (arr[i] != 0) {
                int r = arr[i] % 10;
                sum += r;
                arr[i] /= 10;
            }
            if (sum == k) {
                if (i < min) {
                    min = i;
                }
            }
        }

        System.out.println("Min Index of the desired sum: ");
        if (min == n) {
            System.out.println("No such element present");
        }
        else {
            System.out.println(min);
        }
    }
}

