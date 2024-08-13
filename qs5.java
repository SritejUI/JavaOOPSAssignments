import java.util.Scanner;

class qs5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of rows in matrix: ");
        int rows = sc.nextInt();
        System.out.println("No. of cols in matrix: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter element: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matix is given by: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int total = rows*cols;
        int cnt = 0;
        int startingRow = 0;
        int startingCol = 0;
        int endingRow = rows - 1;
        int endingCol = cols - 1;
        int[] ans = new int[total];

        while (cnt < total) {
            for (int i = startingCol; cnt < total && i <= endingCol; i++) {
                ans[cnt++] = matrix[startingRow][i];
            }
            startingRow++;
            for (int i = startingRow; cnt < total && i <= endingRow; i++) {
                ans[cnt++] = matrix[i][endingCol];
            }
            endingCol--;
            for (int i = endingCol; cnt < total && i >= startingCol; i--) {
                ans[cnt++] = matrix[endingRow][i];
            }
            endingRow--;
            for (int i = endingRow; cnt < total && i >= startingRow; i--) {
                ans[cnt++] = matrix[i][startingCol];
            }
            startingCol++;
        }

        System.out.println("Spiral traversal: ");
        for (int i = 0; i < total; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
