import java.util.Scanner;

class qs4 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element: ");
            arr[i] = sc.nextInt();
        }

        int curr = 0;
        int max = 0;
        int num = Integer.MIN_VALUE;
        int temp = 0;
        int i;

        for (i = 0; i < n; i++) {
            if (num < arr[i]) {
                curr++;
            }
            else {
                if (curr > max) {
                    max = curr;
                    temp = i;
                }
                curr = 1;
            }
            num = arr[i];
        }

        if (curr > max) {
            max = curr;
            temp = i;
        }

        System.out.println("Intial String is given as: ");
        for(i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("The substring is given as: ");
        for (i = temp - max; i < temp; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
