import java.util.Scanner;

class Company {
    public String name;
    public double salary;
}

class MinMax extends Company {
    public double min = Integer.MAX_VALUE;
    public double max = Integer.MIN_VALUE;

    public void minDisplay(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min Salary: " + min);
    }

    public void maxDisplay(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max Salary: " + max);
    }

    public double minDisplay(double[] arr , int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public double maxDisplay(double[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

class AvgDiff extends MinMax {
    public void Avg( Company[] c1, int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += c1[i].salary;
        }
        double avg = sum / n;
        System.out.println("Avg. Salary: " + avg);
    }

    public void Diff(double[] arr, int n) {

        double min1 = minDisplay(arr, n);
        double max1 = maxDisplay(arr, n);
        double diff = max1 - min1;
        System.out.println("Difference: " + diff);
    }
}

public class qs7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of employees data to be recorded: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        Company[] c1 = new Company[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Employee name: ");
            c1[i] = new Company();
            c1[i].name = sc.next();
            System.out.println("Employee Salary: ");
            double s = sc.nextDouble();
            arr[i] = s;
            c1[i].salary = s;
        }

        MinMax m1 = new MinMax();
        m1.minDisplay(arr);
        m1.maxDisplay(arr);

        AvgDiff a1 = new AvgDiff();
        a1.Avg(c1 , n);
        a1.Diff(arr , n);
    }
}